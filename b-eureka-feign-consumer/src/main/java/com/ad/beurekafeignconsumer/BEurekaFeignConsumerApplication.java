package com.ad.beurekafeignconsumer;

import com.ad.beurekafeignapi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BEurekaFeignConsumerApplication {

	@FeignClient("eureka-feign-client")
	interface HelloServiceClient extends HelloService {

	}

	@RestController
	class TestController {
		@Autowired
		private HelloServiceClient helloServiceClient;

		@GetMapping("/test")
		public String test(String name) {
			return helloServiceClient.hello(name);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(BEurekaFeignConsumerApplication.class, args);
	}
}
