package chap06.sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("정재현", "970214-1234567");	//명시적 생성자 선언이 되어있으므로 name과 ssn의 매개값을 넣어서 생성자 호출해야함.
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("서영호", "950209-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
