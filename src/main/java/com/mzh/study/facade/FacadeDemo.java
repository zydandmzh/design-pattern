package com.mzh.study.facade;

import com.mzh.study.facade.facades.ComputerFacade;

/**
 * Created by mazhihui on 2020/3/3.
 */
public class FacadeDemo {
    public static void main(String[] args) throws InterruptedException {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
        Thread.sleep(1000L);
        computerFacade.stop();
    }
}
