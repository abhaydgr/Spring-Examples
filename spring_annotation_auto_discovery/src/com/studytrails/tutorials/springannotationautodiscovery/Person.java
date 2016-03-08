package com.studytrails.tutorials.springannotationautodiscovery;

import org.springframework.stereotype.Component;

@Component
public class Person {

	
	private String name = "Alba";
	private String email = "alba@gmail.com";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
