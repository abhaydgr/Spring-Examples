package com.studytrails.tutorials.springexpressionlanguagestaticmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguageStatic {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		RandomNumberGenerator randomNumberGenerator = (RandomNumberGenerator)context.getBean("randomNumberGenerator");
		System.out.println("The generated random number is : " + randomNumberGenerator.getRandomNumber());
		
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
