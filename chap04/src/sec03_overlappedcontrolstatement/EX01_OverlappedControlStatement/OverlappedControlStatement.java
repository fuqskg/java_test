package sec03_overlappedcontrolstatement.EX01_OverlappedControlStatement;

public class OverlappedControlStatement {

	public static void main(String[] args) {
		// if-if중복
		int value1 = 5;
		int value2 = 5;
		if(value1 > 5) {
			if(value2 < 2) {
				System.out.println("실행1");
			}
			else {
				System.out.println("실행2");
			}
		}
		else {
			System.out.println("실행3");
		}
		System.out.println();
		
		
		//swich-for중복
		int value3 = 2;
		switch(value3) {
		case 1:
			for(int k = 0; k < 10; k++) {
				System.out.println(k  + " ");
			}
			break;
		case 2:
			for(int k = 10; k > 0; k--) {
				System.out.println(k + " ");
			}
			break;
		}
		
		System.out.println();
		System.out.println();
		
		//for-for-if중복
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i + " " + j);
				
				if(i==j) {
					System.out.println("i==j");
					System.out.println("i = " + i +"\nj = "+ j);
				}
			}
		}
	}

}
