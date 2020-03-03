package com.mzh.study.facade.compoment;

import com.mzh.study.facade.IComputerCompoment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mazhihui on 2020/3/3.
 */
public class Memory implements IComputerCompoment {
    private static final Logger log = LoggerFactory.getLogger(Memory.class);
    public void start() {
        log.info("memory is start.");
    }

    public void stop() {
        log.info("memory is stop.");
    }
}
