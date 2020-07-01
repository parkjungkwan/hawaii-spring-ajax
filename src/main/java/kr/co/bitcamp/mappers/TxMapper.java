package kr.co.bitcamp.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import kr.co.bitcamp.domains.Person;

@Repository
public interface TxMapper {
	@Insert("insert into persons (userid, password) "
			+ " values #{userid}, #{password}")
	public void insertUser(Person user);

}
