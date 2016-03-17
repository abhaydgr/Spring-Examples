package com.studytrails.tutorials.springaopxml;

import org.aspectj.lang.ProceedingJoinPoint;

public class MethodExecutionTimeAdvice {

	public void calculateMethodExecutionTime(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("MethodExecutionTimeAdvice called: Starting Timer Before Method Execution");
		double startTime = System.currentTimeMillis();
		try {
			proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		double endTime = System.currentTimeMillis();
		System.out.println("MethodExecutionTimeAdvice called: Time taken for execution of method = " + (endTime - startTime) + " ms.");
	}
}
