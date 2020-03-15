package com.mzh.study.observer.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * Created by mazhihui on 2020/3/11.
 */
public class GiveMoneyObserver{
    @Subscribe
    public void handleRegSuccess(Integer userId) {
        System.out.println("给"+userId+"发放体验金。");
    }
}
