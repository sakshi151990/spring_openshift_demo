package com.spring_openshift_demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = {"com.spring_openshift_demo.demo.web"})
public class SpringOpenshiftDemoApplication {

	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringOpenshiftDemoApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftDemoApplication.class, args);
	}

}
