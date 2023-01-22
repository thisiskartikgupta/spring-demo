package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("Spring is RUNNING");
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DemoApplication.class, args);

		GameRunner runner = configurableApplicationContext.getBean(GameRunner.class);
		runner.run();
	}

}
