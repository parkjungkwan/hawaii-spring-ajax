package kr.co.bitcamp.domains;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component
public class Person {
	private String userid, password;
}
