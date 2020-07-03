/**
 * 
 */
package kr.co.bitcamp.tests;

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
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.instanceOf;
/**
 * @FileName :  CalculatorTest.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 2.  
 * @작성자 : pakjkwan@gmail.com
 * https://zorba91.tistory.com/129
 * https://ktko.tistory.com/entry/%EC%8A%A4%ED%94%84%EB%A7%81Spring-MockMvc-%ED%85%8C%EC%8A%A4%ED%8A%B8
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})
public class CalculatorTest {
	@Autowired Calculator mock;

	@Ignore
	public void testSum() {
		assertThat(mock.sum(1, 1), equalTo(2));
	}

	@Test
	public void testSubstract() {
		assertThat(mock.substract(1, 1), equalTo(0));
	}

	@Ignore
	public void testAbsoluteVal() {
		assertThat(mock.absoluteVal(-1), equalTo(1));
	}

}
