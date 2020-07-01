package kr.co.bitcamp.services;

import java.util.Date;

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
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#save()
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#update()
	 */
	@Override
	public void update() {
		
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findOne()
	 */
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findAll()
	 */
	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#count()
	 */
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByEmailAndUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailAndUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByEmailOrUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByCreatedAtBetween(java.util.Date, java.util.Date)
	 */
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByAgeGraterThanEqual(int)
	 */
	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByNameLike(java.lang.String)
	 */
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByAccessCodeIsNull()
	 */
	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByGenerLike(java.lang.String)
	 */
	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByEmailOrderByNameAsc(java.lang.String)
	 */
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}
	

}
