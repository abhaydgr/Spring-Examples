package com.studytrails.tutorials.springmvccontrollerinput;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class PersonService {
	
	private List<Person> persons = new ArrayList<Person>();
	
	public PersonService() {
		persons.add(new Person("Alba", 10));
		persons.add(new Person("Beth", 20));
		persons.add(new Person("Cathy", 30));
		persons.add(new Person("Doug", 10));
	}

	public List<Person> findPersons(Integer age) {
		List<Person> result = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getAge().intValue() == age.intValue()){
				result.add(person);
			}
		}
		return result;
	}
}
