package com.ad.capigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CApiGatewayApplication.class, args);
	}
}
