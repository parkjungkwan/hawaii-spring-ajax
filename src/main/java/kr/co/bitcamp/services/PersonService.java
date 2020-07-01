package kr.co.bitcamp.services;

import java.util.Date;

import org.springframework.stereotype.Component;
import kr.co.bitcamp.domains.Person;
@Component
public interface PersonService {
	 public void save();
	 public void update();
	 public void findOne();
	 public void findAll();	
	 public void count();
	 public void delete();
	 public void findByEmailAndUserId(String email, String userId);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByAccessCodeIsNull();
	 public void findByGenerLike(String gender);
	 public void findByEmailOrderByNameAsc(String email);
}
