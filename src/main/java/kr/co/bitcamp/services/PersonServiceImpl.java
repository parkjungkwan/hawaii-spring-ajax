package kr.co.bitcamp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bitcamp.controllers.PersonController;
import kr.co.bitcamp.domains.Person;
import kr.co.bitcamp.mappers.PersonMapper;

@Service
public class PersonServiceImpl implements PersonService{
	private static final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);
	@Autowired
	PersonMapper personMapper;
	
	public Person findPersonForAccess(Person person) {
		logger.info(person.toString());
		return personMapper.selectUserByIdPw(person);
	}

}
