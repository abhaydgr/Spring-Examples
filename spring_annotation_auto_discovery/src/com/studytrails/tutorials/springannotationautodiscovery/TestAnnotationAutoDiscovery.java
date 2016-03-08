package com.studytrails.tutorials.springannotationautodiscovery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAutoDiscovery {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Person person = (Person)context.getBean("person");
		System.out.println("Person's name = " + person.getName());
		System.out.println("Person's email = " + person.getEmail());
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
