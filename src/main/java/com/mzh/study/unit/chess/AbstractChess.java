package com.mzh.study.unit.chess;

/**
 * Created by mazhihui on 2020/3/9.
 */
public class AbstractChess {
    static{
        System.out.println("父类静态代码块");
    }
    public AbstractChess(){
        System.out.println("父类无参构造方法");
    }
    public AbstractChess(int i){
        System.out.println("父类有参构造方法");
    }
    {
        System.out.println("父类构造代码块");
    }

}
