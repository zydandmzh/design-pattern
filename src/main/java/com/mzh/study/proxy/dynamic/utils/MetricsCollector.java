package com.mzh.study.proxy.dynamic.utils;

import com.mzh.study.proxy.dynamic.domain.RegisterInfo;

/**
 * Created by mazhihui on 2020/3/1.
 */
public class MetricsCollector {
    public boolean register(RegisterInfo registerInfo){
        System.out.println(registerInfo.getUmpkey()+"执行耗时："+(registerInfo.getEndtimestamp() - registerInfo.getStarttimestamp())+"ms");
        return true;
    }
}
