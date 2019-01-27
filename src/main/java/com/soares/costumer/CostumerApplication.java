package com.soares.costumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = "com.soares.costumer")
public class CostumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerApplication.class, args);
	}
}
