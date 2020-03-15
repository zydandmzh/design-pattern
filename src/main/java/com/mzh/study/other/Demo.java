package com.mzh.study.other;

import java.util.Date;

/**
 * Created by mazhihui on 2020/3/12.
 */

public class Demo {
    public long caculateDelayDays(Date dueTime) {
        long currentTimestamp = System.currentTimeMillis();
       if(earlier(dueTime)){
           return 0;
       }
        long delayTime = currentTimestamp - dueTime.getTime();
        long delayDays = delayTime / 86400;
        return delayDays;
    }
    public boolean earlier(Date dueTime){
        long currentTimestamp = System.currentTimeMillis();
        return dueTime.getTime() >= currentTimestamp;
    }
}
