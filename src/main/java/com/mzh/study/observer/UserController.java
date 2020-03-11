package com.mzh.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mazhihui on 2020/3/11.
 */
public class UserController {
    private List<IObserver> observerList = new ArrayList<>();
    public void addObserver(IObserver observer){
        observerList.add(observer);
    }
    public void register(int userId){
        System.out.println(userId+"完成注册！");
        for (IObserver observer : observerList) {
            observer.handleRegSuccess(userId);
        }
    }

    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.addObserver(new GiveMoneyObserver());
        controller.addObserver(new SendInnerMsgObserver());
        controller.addObserver(new NoticePoliceObserver());
        controller.register(123456);
    }
}
