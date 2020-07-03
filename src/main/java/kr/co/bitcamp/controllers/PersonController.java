package kr.co.bitcamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import kr.co.bitcamp.domains.Person;
import kr.co.bitcamp.enums.Messenger;
import kr.co.bitcamp.services.PersonService;

@RestController
@RequestMapping("/person")
@SessionAttributes({"session"})
public class PersonController {
	@Autowired
	PersonService personService;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@PostMapping("/users")
	public Messenger join(@RequestBody Person person) {
		System.out.println("넘어온 회원 정보 "+person.toString());
		return Messenger.SUCCESS; 
	}
	
	@PostMapping("/users/{userid}")
	public Person login(HttpSession session, @RequestBody Person person,
			@PathVariable String userid) {
		Person returnPerson = personService.findByUseridAndPassword(person);
		session.setAttribute("session", returnPerson);
		return returnPerson; 
	}
	@GetMapping("/users")
	public void list(Model model){
		model.addAttribute("persons",personService.findAll());
	}
}









