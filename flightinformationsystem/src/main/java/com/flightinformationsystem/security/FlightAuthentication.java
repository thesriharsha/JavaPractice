package com.flightinformationsystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class FlightAuthentication {
 		@Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

// 			// Needs authentication 
 			http.authorizeHttpRequests().anyRequest().authenticated();
	   
 		//http.authorizeHttpRequests().requestMatchers("/list/**").hasRole("USER");
 		
 		//http.authorizeHttpRequests().requestMatchers("/add/**").hasRole("ADMIN");
 		
 		http.formLogin();
 		http.httpBasic();
 		http.csrf().disable();
 		return http.build();
 		
 		
 		
 		}
}