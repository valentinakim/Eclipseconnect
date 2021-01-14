package day05.SwitchExcercise;

public class Main$StudentAchievement {

	public static void main(String[] args) {
		
		StudentAchievement jaehyun = new StudentAchievement();
		
		jaehyun.stuNum = "970214";
		jaehyun.name = "정재현";
		jaehyun.kor = 91;
		jaehyun.eng = 87;
		jaehyun.math = 75;
		
		
		System.out.println("총점 : " + jaehyun.total());
		System.out.println("평균 : " + jaehyun.avg());
		System.out.println("학점 : " + jaehyun.credit());
		// jSystem.out.println("상품 : " + jaehyun.gift());
		

	}

}
