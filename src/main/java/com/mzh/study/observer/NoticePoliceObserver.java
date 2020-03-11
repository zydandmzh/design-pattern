package com.mzh.study.observer;

/**
 * Created by mazhihui on 2020/3/11.
 */
public class NoticePoliceObserver implements IObserver {
    @Override
    public void handleRegSuccess(int userId) {
        System.out.println("已把"+userId+"注册信息报送给警察。");
    }
}
