package kr.co.bitcamp.mappers;

import org.springframework.stereotype.Repository;

import kr.co.bitcamp.domains.Person;


@Repository
public interface PersonMapper {
	public void insertOneIntoPersons(Person person);
	public Person selectOneFromPersons(Person person);

}
