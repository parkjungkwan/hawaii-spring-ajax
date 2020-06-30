package kr.co.bitcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bitcamp.domains.Person;
import kr.co.bitcamp.mappers.PersonMapper;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonMapper personMapper;
	
	public Person findPersonForAccess(Person person) {
		return personMapper.selectOneFromPersons(person);
	}

}
