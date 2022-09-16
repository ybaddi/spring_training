package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleBoot16Application {

	// add to an other class to test
//	@Value("${server.port}")
//	public static String port;
	public static void main(String[] args) {
		
		SpringApplication.run(ExampleBoot16Application.class, args);
//		System.out.println(port);
	}

}
