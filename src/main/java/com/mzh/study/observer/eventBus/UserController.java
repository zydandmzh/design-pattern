package com.mzh.study.observer.eventBus;

import com.google.common.eventbus.EventBus;

import java.util.Random;

/**
 * Created by mazhihui on 2020/3/11.
 */
public class UserController {
    private EventBus eventBus;
    public UserController(){
        eventBus = new EventBus();
    }
    public void addObserver(Object observer){
        eventBus.register(observer);
    }
    public void register(Integer userId){
        System.out.println(userId+"完成注册！");
        eventBus.post(userId);
        eventBus.post("mazhihui");
    }

    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.addObserver(new GiveMoneyObserver());
        controller.addObserver(new SendInnerMsgObserver());
        controller.addObserver(new NoticePoliceObserver());

        Random random = new Random();
        int maxAscii = 'z';
        System.out.println(random.nextInt(maxAscii));
    }
}
