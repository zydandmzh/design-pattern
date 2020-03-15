package com.mzh.study.other;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mazhihui on 2020/3/12.
 */
public class NewDemo extends Demo{
    public void test(){
        Demo demo = new NewDemo(){
            public boolean earlier(Date dueTime){
             return true;
            }
        };
        demo.caculateDelayDays(toDate("2020-03-03 01:00:00"));
    }
    private Date toDate(String dateStr){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
