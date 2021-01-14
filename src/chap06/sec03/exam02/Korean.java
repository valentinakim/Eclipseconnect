package chap06.sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	//생성자
	public Korean(String name, String ssn) {	//명시적 생성자 선언. 호출할 때 해당 매개변수에 매개값을 넣어서 사용해야함.
		this.name = name;
		//	 ^^^^필드^^^^^ 매개변수
		this.ssn = ssn;
		//   ^^^필드 ^^^ 매개변수
	}
}
