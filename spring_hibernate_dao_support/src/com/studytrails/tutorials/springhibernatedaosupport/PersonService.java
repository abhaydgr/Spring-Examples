package com.studytrails.tutorials.springhibernatedaosupport;

import java.util.List;

public class PersonService {

	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void addPerson(Person person) {
		getPersonDao().insert(person);
	}

	public List<?> fetchAllPersons() {
		return getPersonDao().selectAll();
	}
}
