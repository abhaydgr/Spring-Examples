package com.studytrails.tutorials.springaopannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopAnnotation {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setName("Alba");
		person.setEmail("alba@gmail.com");
		personService.addPerson(person);
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
