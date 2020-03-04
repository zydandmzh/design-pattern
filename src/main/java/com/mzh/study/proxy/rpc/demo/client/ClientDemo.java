package com.mzh.study.proxy.rpc.demo.client;

import com.mzh.study.proxy.rpc.RpcClient;

public class ClientDemo {

    public static void main(String[] args) throws Exception {
      RpcClient client = new RpcClient();
      CalculatorService service = client.refer(CalculatorService.class, "127.0.0.1", 1234);
      int result1 = service.add(2, 4);
      System.out.println("2+4=" + result1);
      int result2 = service.subtract(6, 3);
      System.out.println("6-3=" + result2);
    }

}
