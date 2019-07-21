package com.search.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/*use either @EnableDiscoveryClient or @EnableEurekaClient*/
@EnableFeignClients({"com.search.service.feignclient"})
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.search.service","com.search.controller"})
public class SearchAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchAppApplication.class, args);
	}

}
