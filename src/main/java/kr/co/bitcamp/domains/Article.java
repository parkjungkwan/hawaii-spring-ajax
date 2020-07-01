package kr.co.bitcamp.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Lazy
@Data
@Component
public class Article {
	private int articleNumber, fileNumber;
	private String userid, comment, message, rating, boardtype, title, content; 
}
