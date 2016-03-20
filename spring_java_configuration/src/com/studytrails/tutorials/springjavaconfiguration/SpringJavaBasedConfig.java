package com.studytrails.tutorials.springjavaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaBasedConfig {

	@Bean
	public Person person(){
		Person person = new Person();
		person.setName("Alba");
		person.setEmail("alba@gmail.com");
		return person;
	}
}
