package kr.co.bitcamp.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Lazy
@Data
@Component
public class Article {
	private int artSeq, imageSeq;
	private String userid, comments, message, rating, boardType, title, content; 
}
