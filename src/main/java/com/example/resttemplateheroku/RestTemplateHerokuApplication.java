package com.example.resttemplateheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RestTemplateHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateHerokuApplication.class, args);
	}

}
