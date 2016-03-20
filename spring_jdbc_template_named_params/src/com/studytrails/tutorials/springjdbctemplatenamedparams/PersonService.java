package com.studytrails.tutorials.springjdbctemplatenamedparams;


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

	public Person fetchPerson(String name) {
		return getPersonDao().select(name);
	}
}
