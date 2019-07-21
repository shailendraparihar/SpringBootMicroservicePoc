package com.reservation.security.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author ram
 * 
 *         Custom configure web security using UserDetailsService of
 *         SpringFramework without using any database
 * 
 *         To use this functionality comment all other security configurations
 *         and uncomment this class
 * 
 *         UserDetailsService, User and UserDetails are spring classes
 *
 */

//@Configuration
//@EnableWebSecurity
public class AppSecurityConf2 // extends WebSecurityConfigurerAdapter
{
	/*
	 * @Bean
	 * 
	 * @Override protected UserDetailsService userDetailsService() {
	 * 
	 * List<UserDetails> users = new ArrayList<>();
	 * users.add(User.withDefaultPasswordEncoder().username("user").password(
	 * "password").roles("USER").build()); return new
	 * InMemoryUserDetailsManager(users); }
	 * 
	 */}
