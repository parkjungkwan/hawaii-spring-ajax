/**
 * 
 */
package kr.co.bitcamp.tests;

/**
 * @FileName :  Hello.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 2.  
 * @작성자 : pakjkwan@gmail.com
 * @see : junit 테스트 클래스
 */
public class Hello {
	// bean의 테스트 할 Value값 주는방식
    // 1. xml설정파일에 <property name="name" value ="조성훈"/> 과 같은 프로퍼티 설정 (이때, name맞춰줌)
    // 2. @Value("")로 어노테이션활용
    // 3. @Resource(name = "${sName}")로 properties설정파일 활용
    String name;
    
    // value의 값이 아니라 object를 넣어주는 방식
    // 1. @Autowired
    //      @Qualifier("stringPrinter") 해주면 partner빈 주입해주는것과 같다    
    // 2. @Resource(name = "${printer}") 활용
    Printer printer;
 
    public Hello() {
        System.out.println("Hello 기본 생성자 호출");
    }
 
    public Hello(String name, Printer printer) {
            System.out.println("Hello 오버로딩된 생성자");
        this.name = name;
        this.printer = printer;
    }
 
    public void setName(String name) {
        System.out.println("setNames 기본 생성자 호출 : " + name);
        this.name = name;
    }
 
    public void setPrinter(Printer printer) {
        System.out.println("setPrinter 기본 생성자 호출 : " + printer.getClass().getName());
        this.printer = printer;
    }
 
    public String sayHello() {
        return "Hello " + name;
    }
 
    public void print() {
        this.printer.print(sayHello());
    }
 
}
