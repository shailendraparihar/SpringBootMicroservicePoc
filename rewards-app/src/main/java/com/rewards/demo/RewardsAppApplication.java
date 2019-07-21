package com.rewards.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rewards.service.RewardsService;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@ComponentScan({ "com.rewards.service", "com.rewards.controller" })
public class RewardsAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(RewardsAppApplication.class, args);
		RewardsService rewardsService = appContext.getBean(RewardsService.class);
		rewardsService.createDefaultCustomerList();
	}

}
