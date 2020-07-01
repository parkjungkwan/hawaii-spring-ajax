package kr.co.bitcamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import kr.co.bitcamp.domains.Person;
import kr.co.bitcamp.enums.Messenger;
import kr.co.bitcamp.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService personService;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@PostMapping("/users")
	public Messenger join(@RequestBody Person person) {
		System.out.println("넘어온 회원 정보 "+person.toString());
		return Messenger.SUCCESS; 
	}
	

}









