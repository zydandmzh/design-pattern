package com.mzh.study.facade.facades;

import com.mzh.study.facade.IComputerCompoment;
import com.mzh.study.facade.compoment.Cpu;
import com.mzh.study.facade.compoment.Disk;
import com.mzh.study.facade.compoment.Memory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mazhihui on 2020/3/3.
 */
public class ComputerFacade {
    private static final Logger logger = LoggerFactory.getLogger(ComputerFacade.class);
    private IComputerCompoment cpu;
    private IComputerCompoment memory;
    private IComputerCompoment disk;
    public ComputerFacade(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }
    public void start(){
        cpu.start();
        memory.start();
        disk.start();
        logger.info("computer is start.");
    }
    public void stop(){
        cpu.stop();
        memory.stop();
        disk.stop();
        logger.info("computer is stop.");
    }
}
