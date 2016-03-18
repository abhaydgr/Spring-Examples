package com.studytrails.tutorials.springexpressionlanguagemathoperators;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguageMathOperators {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		PerimeterCalculator perimeterCalculator = (PerimeterCalculator)context.getBean("perimeterCalculator");
		System.out.println("The perimeter of rectangle is : " + perimeterCalculator.getPerimeter());
		
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
