package com.mzh.study.proxy.rpc.demo.server;

import com.mzh.study.proxy.rpc.RpcServer;

public class RpcServerApplication {

    public static void main(String[] args) throws Exception {
      CalculatorService service = new CalculatorServiceImpl();
      RpcServer server = new RpcServer();
      server.export(service, 1234);
      System.out.println("server is running!");
    }

}
