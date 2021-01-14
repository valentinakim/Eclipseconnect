package day06.ForExcercise;

import java.util.Scanner;

public class Quiz4Main {

	public static void main(String[] args) {
		//스캐너 생성
		
				Scanner sc = new Scanner(System.in);
				
				// 첫번째 정수 : 2
				// 두번째 정수 : 10
				
				// >> 결과 <<		
				// 2부터 10까지의 홀수의 합 : 24
				// 2부터 10까지의 짝수의 합 : 30
				
				for(;;) {
					try {
						
						System.out.print("첫번째 정수 : ");
						int num1 = Integer.parseInt(sc.nextLine());
						 
						
						System.out.print("두번째 정수 : ");
						int num2 = Integer.parseInt(sc.nextLine());
						
						int j = 0;
						int i = 0;
						int sum = 0;
						for(j=num1;i<num2-num1+1;i++,j++) {
							if(j%2 != 0) {
								continue;
							}
							sum += j;			
						}
						System.out.println(">> 결과 <<");
						System.out.println(num1 + "부터 " + num2 + "까지의 홀수의 합 : " + j);
						
						sc.close();
						break;
						} catch(NumberFormatException e) {
							System.out.println(">> 정수만 입력하세요 <<");
						}
				
				}//end of for--------------------
				
	}

}
