package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//curl -X POST "http://localhost:3344/actuator/bus-refresh 刷新配置，全部广播
//curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355 定点通知
public class CenterConfig3344 {
    public static void main(String[] args) {
        SpringApplication.run(CenterConfig3344.class,args);
    }
}
