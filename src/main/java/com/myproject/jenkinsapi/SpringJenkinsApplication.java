package com.myproject.jenkinsapi;

import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started.....");
	}
	
	public static void main(String[] args) {
		
		logger.info("Application Excecuted...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
