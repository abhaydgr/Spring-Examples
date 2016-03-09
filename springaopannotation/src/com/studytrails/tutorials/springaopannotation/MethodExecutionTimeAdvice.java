package com.studytrails.tutorials.springaopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class MethodExecutionTimeAdvice {

	@Pointcut("execution(* com.studytrails.tutorials.springaopannotation.PersonService.addPerson(..))")
	public void methodExecutionTimePointcut(){
		
	}
	@Around("methodExecutionTimePointcut()")
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
