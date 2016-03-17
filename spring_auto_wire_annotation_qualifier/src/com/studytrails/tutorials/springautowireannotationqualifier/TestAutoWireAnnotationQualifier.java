package com.studytrails.tutorials.springautowireannotationqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireAnnotationQualifier {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		ATM atm = (ATM)context.getBean("atm");
		String accountNumber = "AC5645786";
		atm.printBalanceInformation(accountNumber);
		
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
