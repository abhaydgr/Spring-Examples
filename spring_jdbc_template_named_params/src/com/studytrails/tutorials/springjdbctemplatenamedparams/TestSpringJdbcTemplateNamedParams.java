package com.studytrails.tutorials.springjdbctemplatenamedparams;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringJdbcTemplateNamedParams {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		PersonService personService = (PersonService) context.getBean("personService");
		
		Person person = new Person();
		String name = "Alba";
		
		person.setName(name);
		person.setEmail("alba@gmail.com");
		personService.addPerson(person);
		System.out.println("Person : " + person + " added successfully");
		
		Person personFetched = personService.fetchPerson(name);
		System.out.println("The person object with name " + name + " = " + personFetched);
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
