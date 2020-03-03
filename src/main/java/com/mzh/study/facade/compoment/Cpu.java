package com.mzh.study.facade.compoment;

import com.mzh.study.facade.IComputerCompoment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mazhihui on 2020/3/3.
 */
public class Cpu implements IComputerCompoment {
    private static final Logger log = LoggerFactory.getLogger(Cpu.class);
    public void start() {
        log.info("cpu is start.");
    }

    public void stop() {
        log.info("cpu is stop.");
    }
}
