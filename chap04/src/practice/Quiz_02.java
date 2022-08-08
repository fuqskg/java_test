package practice;

public class Quiz_02 {

	public static void main(String[] args) {
		// 1번과 같은 동작을 하는 switch문 작성
		
		int score = 72/10;
		
		switch (score) {
		case 10:
			System.out.println("A학점");
			break;

		case 9:
			System.out.println("A학점");
			break;
			
		case 8:
			System.out.println("B학점");
			break;

		case 7:
			System.out.println("C학점");
			break;

			
		default:
			System.out.println("F학점");
			break;
		}
		
		
	}

}
