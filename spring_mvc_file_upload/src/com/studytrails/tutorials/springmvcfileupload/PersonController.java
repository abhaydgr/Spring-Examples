package com.studytrails.tutorials.springmvcfileupload;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PersonController implements ServletContextAware {

	private PersonService personService;
	private ServletContext servletContext;

	public PersonService getPersonService() {
		return personService;
	}

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("/allpersons")
	public String showPersonListPage(Map<String, Object> model) {
		model.put("persons", getPersonService().fetchAllPersons());
		return "person_list";
	}

	@RequestMapping(value = "/person", method = GET)
	public String showNewPersonForm(@RequestParam("new") String age,
			Map<String, Object> model) {
		model.put("person", new Person());
		return "new_person";
	}

	@RequestMapping(value = "/person/add", method = RequestMethod.POST)
	public String addPersonFromForm(@Valid Person person,
			BindingResult bindingResult,
			@RequestParam(value = "image", required = false) MultipartFile image) {
	
		if (!image.isEmpty()) {
			try {
				validateImage(image);

			} catch (RuntimeException re) {
				bindingResult.reject(re.getMessage());
				return "redirect:/person?new";
			}

			try {
				saveImage(person.getName() + ".jpg", image);
			} catch (IOException e) {
				bindingResult.reject(e.getMessage());
				return "redirect:/person?new";
			}
		}

		getPersonService().addPerson(person);
		return "redirect:/allpersons";
	}

	private void validateImage(MultipartFile image) {
		if (!image.getContentType().equals("image/jpeg")) {
			throw new RuntimeException("Only JPG images are accepted");
		}
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;

	}

	private void saveImage(String filename, MultipartFile image)
			throws RuntimeException, IOException {
		try {
			File file = new File(servletContext.getRealPath("/") + "/"
					+ filename);

			FileUtils.writeByteArrayToFile(file, image.getBytes());
			System.out.println("Go to the location:  " + file.toString()
					+ " on your computer and verify that the image has been stored.");
		} catch (IOException e) {
			throw e;
		}
	}

}
