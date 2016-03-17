package com.studytrails.tutorials.springautowireannotationvaluejsr330;

import org.springframework.beans.factory.annotation.Value;

public class Person {

	
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	@Value("Alba")
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@Value("alba@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
}
