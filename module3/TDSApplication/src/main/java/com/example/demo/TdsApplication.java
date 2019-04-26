package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.TDSDao")
@ComponentScan("com.example.TDSService")
@ComponentScan("com.example.demo")
@ComponentScan("com.example.model")
@EntityScan(basePackages = {"com.example.model"})
@SpringBootApplication
public class TdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdsApplication.class, args);
	}

}
