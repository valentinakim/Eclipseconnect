package day06.ForExcercise;

import java.util.Scanner;

public class Quiz5Main {

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
				String strNum1 = sc.nextLine();
				int num1 = Integer.parseInt(strNum1);
				
				System.out.print("두번째 정수 : ");
				String strNum2 = sc.nextLine();
				int num2 = Integer.parseInt(strNum2);
				
				int holSum = 0;	//홀수의 누적의 합계를 저장하는 변수
				int jjakSum = 0; //짝수의 누적의 합계를 저장하는 변수

				int evenNum = 0;
				int oddNum = 0;
				// 홀수의 합
				// 홀수도 나오고 짝수도 나와야한다
				for(;;) {
					if(num1%2 != 0) {
						oddNum = num1;
					} 
					else {
						evenNum = num1;
					}
					
					if(num1 <= num2) {
						holSum += oddNum;
						jjakSum += evenNum;
					}
					else
						break;
					num1 +=2;
				}
				
				
				/* 내가 한 문제풀이
				for(;;) {
					
					if(num1%2 != 0) {
						oddNum = num1;
						if(num1 <= num2) {
							holSum += oddNum;			//합계 구하는 식			
						}
					}					
					else if(num1%2 == 0) {
						evenNum = num1;
						if(num1 <= num2) {
							jjakSum += evenNum;						
						}
					}					
					if(num1 > num2) 
						break;
					num1 +=2;	
				}
				*/
				/*
				num1 = Integer.parseInt(strNum1);
				
				
				for(;;) {
					
					if(num1%2 != 0) {
						num1 = num1+1;
					}
					
					if(num1 <=  num2) {
						jjakSum += num1;
							
					}
					else {
						break;
					}
					num1 +=2;		
				}
				*/
				
				System.out.println(">> 결과  <<");
				System.out.println(strNum1 + "부터 " + strNum2 + "까지의 홀수의 합 : " + holSum);
				System.out.println(strNum1 + "부터 " + strNum2 + "까지의 짝수의 합 : " + jjakSum);

				
				sc.close();
				break;
				} catch(NumberFormatException e) {
					System.out.println(">> 정수만 입력하세요 <<");
				}
		
		}//end of for--------------------

	}

}
