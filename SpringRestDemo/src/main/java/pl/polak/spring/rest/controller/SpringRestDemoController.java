package pl.polak.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.polak.spring.rest.domain.Patient;
import pl.polak.spring.rest.service.SpringRestDemoService;

@Controller
@RequestMapping("/patient")
public class SpringRestDemoController {

	private SpringRestDemoService service;  
	
	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public List<Patient> getAllPatientsAsJson() {
		List<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient("Jan", "Kowalski", 30));
		patients.add(new Patient("Piotr", "Kowalczyk", 25));
		patients.add(new Patient("Jacek", "Mazur", 22));
		return patients;
	}
	
}
