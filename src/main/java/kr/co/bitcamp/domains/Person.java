package kr.co.bitcamp.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;
@Lazy
@Data
@Component
public class Person {
	private String userid,password,name,birthday,
					gender,telephone, regdate, 
					accessNumber;
}
/**
accessNumber
 */