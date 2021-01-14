package day06.ForExcercise;

public class Quiz2Main {

	public static void main(String[] args) {
		
		String word = "super007Man";
		
		// 최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> super
		
		String str = "";
		char ch = ' ';
		
		
		for(int i=0; i<word.length(); i++) {	//word.length(); ==> 11
			ch = word.charAt(i);
						
			if(Character.isDigit(ch)) {
				break;
			}			
			str+=String.valueOf(ch);			
		}		
		
		System.out.print("최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> " + str);
		
		// 최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> 5
		
		int cnt = 0;
		
		for(int i=0; i<word.length(); i++) {
			ch = word.charAt(i);
			
			if(Character.isDigit(ch)) {
				break;
			}		
			
			cnt+=1;
		}
		System.out.println("\n최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> " +cnt);
				
				
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
		// 알파벳 소문자를 출력하되 한글자씩 건너뛰어서 출력하기 (for문 이용)
		// a,c,e,g,i,k,m,o,q,s,u,w,y
		// 알파벳 소문자 char 값 범위 97 ~ 122
		
		
		for(int i=0, j=97; i<26; i++, j++) {
			
			String alphabetStr = String.valueOf((char)j);
			
			if(j%2 == 0) {				
				continue;
			} else if(i < 24) {// 맨 마지막 숫자 제외하고 다 + 붙여주기					   
					alphabetStr += ",";					
				}
				else {
					alphabetStr += "";
				}
				System.out.print(alphabetStr);
			}
		/*
		char jj = 97;	
		String alphabetStr = String.valueOf(jj);
		System.out.println(alphabetStr);
		*/
			
		}
		
	}


