package com.vusalaxndzde.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return runner -> {
			System.out.println("Hello World");
		};
	}

//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				System.out.println("Hello World");
//			}
//		};
//	}

}
