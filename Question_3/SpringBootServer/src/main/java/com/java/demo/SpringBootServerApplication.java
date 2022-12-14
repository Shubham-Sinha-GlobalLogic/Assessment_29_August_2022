package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServerApplication.class, args);
	}

}
