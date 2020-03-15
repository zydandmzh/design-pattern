package com.mzh.study.observer.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * Created by mazhihui on 2020/3/11.
 */
public class SendInnerMsgObserver {
    @Subscribe
    public void handleRegSuccess(String userId) {
        System.out.println("给"+userId+"发送站内信。");
    }
}
