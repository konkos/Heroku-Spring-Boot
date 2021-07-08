package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//https://stackoverflow.com/questions/53604111/heroku-cannot-deploy-java-11-spring-boot-app
	}

}
