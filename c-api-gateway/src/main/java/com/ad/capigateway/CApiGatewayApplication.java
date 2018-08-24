package com.ad.capigateway;

import com.ad.capigateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class CApiGatewayApplication {

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(CApiGatewayApplication.class, args);
	}
}
