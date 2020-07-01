package kr.co.bitcamp.mappers;

import java.util.HashMap;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import kr.co.bitcamp.domains.Person;


@Repository
public interface PersonMapper {
	public void insertUser(Person user);
	public Person selectUserByIdPw(Person user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncateUser(HashMap<String, String> paramMap);
}
