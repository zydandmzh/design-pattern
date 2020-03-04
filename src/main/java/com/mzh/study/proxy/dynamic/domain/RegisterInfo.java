package com.mzh.study.proxy.dynamic.domain;

/**
 * Created by mazhihui on 2020/3/1.
 */
public class RegisterInfo {
    private String umpkey;
    private long starttimestamp;
    private long endtimestamp;

    public RegisterInfo(String umpkey,long starttimestamp,long endtimestamp){
        this.umpkey = umpkey;
        this.starttimestamp = starttimestamp;
        this.endtimestamp = endtimestamp;
    }
    public String getUmpkey() {
        return umpkey;
    }

    public void setUmpkey(String umpkey) {
        this.umpkey = umpkey;
    }

    public long getStarttimestamp() {
        return starttimestamp;
    }

    public void setStarttimestamp(long starttimestamp) {
        this.starttimestamp = starttimestamp;
    }

    public long getEndtimestamp() {
        return endtimestamp;
    }

    public void setEndtimestamp(long endtimestamp) {
        this.endtimestamp = endtimestamp;
    }
}
