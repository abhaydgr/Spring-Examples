package com.studytrails.springboot.basics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicsApplication implements CommandLineRunner {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("main");
	}
}
