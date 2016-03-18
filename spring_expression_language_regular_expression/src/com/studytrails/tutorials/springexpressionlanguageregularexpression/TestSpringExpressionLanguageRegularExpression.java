package com.studytrails.tutorials.springexpressionlanguageregularexpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguageRegularExpression {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		EmailValidator emailValidator = (EmailValidator)context.getBean("emailValidator");
		System.out.println("Is the email id value ?  : " + emailValidator.getEmailValid());
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
