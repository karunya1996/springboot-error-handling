package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"main.controllers", "main.repositories"})
@EnableJpaRepositories("main.repositories")
@EntityScan("com.example.demo.model")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//Combines @Configuration, @EnableAutoConfiguration, @ComponentScan
public class TestProjectApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SpringApplication.run(TestProjectApplication.class, args);
	}

}

