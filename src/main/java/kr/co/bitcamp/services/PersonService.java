package kr.co.bitcamp.services;

import org.springframework.stereotype.Component;

import kr.co.bitcamp.domains.Person;
@Component
public interface PersonService {
	public Person findPersonForAccess(Person person);
}
