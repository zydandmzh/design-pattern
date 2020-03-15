package com.mzh.study.observer.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * Created by mazhihui on 2020/3/11.
 */
public class NoticePoliceObserver{
    @Subscribe
    public void handleRegSuccess(Integer userId) {
        System.out.println("已把"+userId+"注册信息报送给警察。");
    }
}
