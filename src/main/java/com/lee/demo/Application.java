package com.lee.demo;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableDiscoveryClient
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
}
