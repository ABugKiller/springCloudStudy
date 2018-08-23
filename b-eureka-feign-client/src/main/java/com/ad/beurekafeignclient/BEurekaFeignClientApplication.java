package com.ad.beurekafeignclient;

import com.ad.beurekafeignapi.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class BEurekaFeignClientApplication {

    @RestController
    class HelloController implements HelloService {
        @Override
        public String hello(String name) {
            return "hello " + name;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(BEurekaFeignClientApplication.class, args);
    }
}
