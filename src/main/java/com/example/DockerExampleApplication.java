package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan
@EnableWebMvc
@RestController
public class DockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
		System.out.println(" Hello -- Docker will build an image: ");
	}

	@RequestMapping("/")
	public String home() {
		//http://localhost:8080/
		return "Hello Docker World Started";
	}
}
