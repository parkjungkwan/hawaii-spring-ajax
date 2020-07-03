/**
 * 
 */
package kr.co.bitcamp.tests;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import kr.co.bitcamp.proxies.Box;

/**
 * @FileName :  Hello.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 2.  
 * @작성자 : pakjkwan@gmail.com
 * @see : junit 테스트 클래스
 */
@Component
public class Calculator {
	@Autowired Box<Integer> box;
	
	public int sum(int a, int b) {
		box.put("res", a + b);
		return box.get("res");
	}
	public int substract(int a, int b) {
		return a - b;
	}
	public int absoluteVal(int a) {
		return Math.abs(a);
	}
	
 
}
