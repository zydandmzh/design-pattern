package com.mzh.study.ucc;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.util.concurrent.CountDownLatch;

/**
 * Created by mazhihui on 2020/3/4.
 */
public class ZookeeperProSync implements Watcher{
    private static CountDownLatch latch = new CountDownLatch(1);
    private static ZooKeeper zk = null;
    private static Stat stat = new Stat();
    @Override
    public void process(WatchedEvent watchedEvent) {
        if(Event.KeeperState.SyncConnected == watchedEvent.getState()){
            if(Event.EventType.None == watchedEvent.getType() && null == watchedEvent.getPath()){
                latch.countDown();
            } else if (Event.EventType.NodeDataChanged == watchedEvent.getType()){
                try {
                    System.out.println("配置值更新为：" + new String(zk.getData(watchedEvent.getPath(),true,stat)));
                } catch (Exception e) {
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String path = "/username";
        zk = new ZooKeeper("192.168.109.101:2181",5000,new ZookeeperProSync());
        latch.await();
        System.out.println(new String(zk.getData(path,true,stat)));
        Thread.sleep(Integer.MAX_VALUE);
    }
}
