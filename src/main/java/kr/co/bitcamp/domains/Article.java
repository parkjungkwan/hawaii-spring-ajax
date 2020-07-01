package kr.co.bitcamp.domains;
/**
 * @FileName :  Article.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 1.  
 * @작성자 : pakjkwan@gmail.com
 * @설 명 : 게시글 DTO
 * articleNumber :  
 * fileNumber : 
 * userid :
 * comment : 
 * message : 
 * rating :
 * boardtype :
 * title : 
 * content : 
 */
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
