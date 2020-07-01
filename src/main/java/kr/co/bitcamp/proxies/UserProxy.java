package kr.co.bitcamp.proxies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.bitcamp.tx.TxMapper;

@Component("manager") 
public class UserProxy extends Proxy{
	@Autowired TxMapper txMapper;
	
	public String makeBirthday() {
		// 가우스 정규분포
		String birthday = "";
		return birthday;
	}
	public String makeGender() {
		List<String> genderText = Arrays.asList("M","F");
		Collections.shuffle(genderText);
		return genderText.get(0);
	}
	public String makeUserid() {
		List<String> useridText = Arrays.asList("a","b");
		Collections.shuffle(useridText);
		return useridText.get(0);
	}
	public String makeName() {
		return "";
	}
	public String makeTelephone() {
		return "";
	}
	
	
	
}
