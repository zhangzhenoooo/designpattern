package com.study.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@ServletComponentScan(basePackages = {"com.study.security.config"})
@SpringBootApplication
public class SecuritydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritydemoApplication.class, args);
	}

}
