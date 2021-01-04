package com.study.webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.study.webmvc.config"})
public class WebmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebmvcApplication.class, args);
	}

}
