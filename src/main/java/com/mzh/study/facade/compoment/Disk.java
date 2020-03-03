package com.mzh.study.facade.compoment;

import com.mzh.study.facade.IComputerCompoment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mazhihui on 2020/3/3.
 */
public class Disk implements IComputerCompoment {
    private static final Logger log = LoggerFactory.getLogger(Disk.class);
    public void start() {
        log.info("disk is start.");
    }

    public void stop() {
        log.info("disk is stop.");
    }
}
