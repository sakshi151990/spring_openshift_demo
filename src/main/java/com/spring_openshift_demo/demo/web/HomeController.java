package com.spring_openshift_demo.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("inside welcome");
		return "welcome to openshift demo";

	}

}
