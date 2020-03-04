package com.mzh.study.proxy.dynamic.controller;

/**
 * Created by mazhihui on 2020/3/1.
 */
public class UserController implements IUserController {
    public boolean register() {
        try {
            Thread.sleep(3200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("注册成功");
        return true;
    }

    public boolean login() {
        try {
            Thread.sleep(1034L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("登录成功");
        return true;
    }
}
