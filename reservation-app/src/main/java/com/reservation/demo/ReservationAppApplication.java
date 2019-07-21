package com.reservation.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import com.reservation.service.ReservationService;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@ComponentScan({ "com.reservation.controller", "com.reservation.service", "com.reservation.security.conf" })
@EnableJpaRepositories(basePackages = { "com.reservation.security.conf" })
@EntityScan("com.reservation.model")
public class ReservationAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(ReservationAppApplication.class, args);
		ReservationService reservationService = appContext.getBean(ReservationService.class);
		reservationService.createDefaultHotelList();
	}

	/**
	 * LoadBalanced used as a marker annotation indicating that the annotated
	 * RestTemplate should use a RibbonLoadBalancerClient for interacting with your
	 * service(s)
	 * 
	 * @return
	 */
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
