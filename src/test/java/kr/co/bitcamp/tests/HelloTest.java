/**
 * 
 */
package kr.co.bitcamp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @FileName :  HelloTest.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 2.  
 * @작성자 : pakjkwan@gmail.com
 */
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/*-context.xml")
public class HelloTest {

	@Autowired Hello hello;

	@Test
	public void helloBean() {
		// 값 비교 (Junit)
		Assert.assertEquals("Hello 조성훈", hello.sayHello());
		hello.print();
	
	}

}
