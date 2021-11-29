package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.demo.topic")
@SpringBootApplication
public class SpringcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcourseApplication.class, args);
	}

}
