package com.lee.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloDemoController {

	@Value("${lee.test}")
	private String leeTest;
	@Value("${common.test}")
	private String commonTest;

	@GetMapping("/get/config")
	public String getConfigFromApollo() {

		return leeTest;
	}

	@GetMapping("/get/namespace")
	public String getNamespaceFromApollo() {

		return commonTest;
	}

}
