package sec01_selectcontrolstatement.Ex02_SwitchControlStatement;

public class SwitchControlStatement {

	public static void main(String[] args) {
		//break가 포함되지 않았을 때
		
		int value1 = 2;
		switch (value1){
		case 1: {
			System.out.println("A");
		}
		case 2: {
			System.out.println("B"); //여기로 이동후 break가 없으므로 다음 케이스문 차례대로 실행.
		}
		case 3: {
			System.out.println("C");
		}
		default:
			System.out.println("D");
		}
		System.out.println();
		
		
		//break가 포함됐을 때

		int value2 = 3;
		switch (value2) {
		
		case 1: {
			System.out.println("A");
			break;
		}
		case 2: {
			System.out.println("B");
			break;
		}
		case 3: {
			System.out.println("C");
			break;
		}
		default:
			System.out.println("D");
		}
		System.out.println();
		
		//if-else if-else 구문으로 변환
		
		if (value1 == 1) {
			System.out.println("A");
		}
		else if (value1 == 2) {
			System.out.println("B");
		}
		else if (value1 == 3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
			}

	}	

}
