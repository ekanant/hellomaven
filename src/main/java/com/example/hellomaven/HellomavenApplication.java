package com.example.hellomaven;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellomavenApplication implements CommandLineRunner {
	Logger logger = LogManager.getLogger(HellomavenApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HellomavenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello Spring");
		logger.info("Hello Spring Log4j");
	}
}
