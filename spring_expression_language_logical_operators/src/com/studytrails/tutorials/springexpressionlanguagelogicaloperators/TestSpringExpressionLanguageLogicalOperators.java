package com.studytrails.tutorials.springexpressionlanguagelogicaloperators;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguageLogicalOperators {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		ExaminationResult examinationResult = (ExaminationResult)context.getBean("examinationResult");
		System.out.println("Has the student passed?  : " + examinationResult.getHasPassed());
		System.out.println("The result message is : " + examinationResult.getResultMessage());
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
