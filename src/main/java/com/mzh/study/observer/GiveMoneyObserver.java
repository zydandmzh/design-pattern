package com.mzh.study.observer;

/**
 * Created by mazhihui on 2020/3/11.
 */
public class GiveMoneyObserver implements IObserver {
    @Override
    public void handleRegSuccess(int userId) {
        System.out.println("给"+userId+"发放体验金。");
    }
}
