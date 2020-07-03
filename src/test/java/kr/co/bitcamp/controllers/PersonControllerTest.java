/**
 * 
 */
package kr.co.bitcamp.controllers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import kr.co.bitcamp.services.PersonService;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.instanceOf;

/**
 * @FileName :  PersonControllerTest.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 3.  
 * @작성자 : pakjkwan@gmail.com
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})
public class PersonControllerTest {

	private PersonService service;

	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
