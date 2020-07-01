package kr.co.bitcamp.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Lazy
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Image {
	private int imageSeq;
	private String image;
}
