package practice;

public class Quiz_01 {

	public static void main(String[] args) {
		// if 선택 제어문의 조건식을 완성하시오.
		
		int score=72;
		
		if(score<90 && score >=80) {
			System.out.println("B학점");
		}
		else if (score >= 90) {
			System.out.println("A학점");
		}
		else if(score < 80 && score >= 70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}

	}

}
