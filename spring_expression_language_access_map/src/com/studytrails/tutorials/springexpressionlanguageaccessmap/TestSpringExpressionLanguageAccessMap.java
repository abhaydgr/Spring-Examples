package com.studytrails.tutorials.springexpressionlanguageaccessmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguageAccessMap {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		TelephoneDirectoryAccessor telephoneDirectoryAccessor = (TelephoneDirectoryAccessor)context.getBean("telephoneDirectoryAccessor");
		System.out.println("Alba's phone number is : " + telephoneDirectoryAccessor.getAlbaPhoneNumber());
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
