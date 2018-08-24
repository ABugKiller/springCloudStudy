package com.ad.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProviderApplication {

	@RequestMapping(value = "/hello")
	public String index() {
		System.out.println("request is coming...");
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			System.out.println("线程被打断... " + e.getMessage());
		}
		return "hello spring ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}
}
