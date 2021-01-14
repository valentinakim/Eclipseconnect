package day05.SwitchExcercise;

public class StudentAchievement {

	String stuNum;
	String name;
	int kor;
	int eng;
	int math;
	
	int total() {
		return kor+eng+math;
	}
	
	float avg() {
		return total()/3.0f;
	}
	
	// avg() = 100	97	91 	90	=> "A"
	// avg() = 89	81	80		=> "B"
	// avg() = 79	71 	70		=> "C"
	// avg() = 69	61	60		=> "D"
	// avg() = 나머지				=> "F"
	
	// avg() = 100	97	91 	90	=> "A"
	// avg() = 89	81	80		=> "B"
	// avg() = 79	71 	70		=> "C"
	// avg() = 69	61	60		=> "D"
	// avg() = 나머지				=> "F"
	
	
	String credit() {
		switch (avg()) {
		case 10:
		case 9:
			
			break;

		default:
			break;
		}
		
		
		return "학점"; 
	}
	
	
}

