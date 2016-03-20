package com.studytrails.tutorials.springjdbctemplatenamedparams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Person person) {
		String insertSql = "INSERT INTO PERSON (NAME, EMAIL) VALUES(?,?)";
		String name = person.getName();
		String email = person.getEmail();

		getJdbcTemplate().update(insertSql, new Object[] { name, email });

	}

	public Person select(String name) {
		String selectAllSql = "SELECT * FROM PERSON where name = ?";
		List<Person> persons = getJdbcTemplate().query(selectAllSql,
				new PersonRowMapper(), name);

		return persons.get(0);
	}

}
