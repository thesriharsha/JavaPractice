package com.flightinformationsystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class InMemorySecurity {

	@Bean
    public UserDetailsService userDetails(PasswordEncoder encoder)
    {
    	UserDetails user  = User.withUsername("passenger").
    			password(encoder.encode("view")).roles("USER").build();
    	UserDetails admin = User.withUsername("flightmanager").
    			password(encoder.encode("edit")).roles("USER","ADMIN").build();
    	
    	return new InMemoryUserDetailsManager(user,admin);
    }
    
	@Bean
	public PasswordEncoder encoder()
	{
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		return encoder;
	}
}