/**
 * 
 */
package kr.co.bitcamp.tests;

/**
 * @FileName :  ConsolePrinter.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 2.  
 * @작성자 : pakjkwan@gmail.com
 */
public class ConsolePrinter implements Printer {
	 public void print(String message) {
	        System.out.println(message);
	 }
}
