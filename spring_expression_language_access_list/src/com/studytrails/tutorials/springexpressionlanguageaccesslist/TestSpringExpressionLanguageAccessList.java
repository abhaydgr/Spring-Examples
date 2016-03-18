package com.studytrails.tutorials.springexpressionlanguageaccesslist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguageAccessList {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		StudentListAccessor studentListAccessor = (StudentListAccessor)context.getBean("studentListAccessor");
		System.out.println("The third student in the list is : " + studentListAccessor.getThirdStudentInList());
		System.out.println("The names of all students is : " + studentListAccessor.getStudentNames());
		System.out.println("The failed students are : " + studentListAccessor.getFailedStudents());
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
