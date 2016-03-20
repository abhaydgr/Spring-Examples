package com.studytrails.tutorials.springmvccontrollerinput;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value="/persons", method=GET)
	public String showPersonListForGivenAge(@RequestParam("age")String age, Map<String, Object> model){
		List<Person> personList = getPersonService().findPersons(new Integer(age));
		model.put("persons", personList);
		return "person_list";
	}

}
