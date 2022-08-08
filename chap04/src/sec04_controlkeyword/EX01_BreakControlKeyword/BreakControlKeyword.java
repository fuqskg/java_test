package sec04_controlkeyword.EX01_BreakControlKeyword;

public class BreakControlKeyword {

	public static void main(String[] args) {
		//단일반복문 탈출
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
		}
		
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println();
		
		//다중 반복문 탈출
		//1개의 반복문만 탈출할 때
		for(int i = 0; i<5; i++) { //0,1,2,3,4돎
			for(int j = 0; j < 5; j++) {//0,1,2,3,4 돎
				if(j == 2) {
					break; //j가 2가 되면 멈춤
				}
				System.out.println(i+", "+j);
			}
			
		}
		System.out.println();
		System.out.println();
		
		//break+Label문으로 다중반복문 탈출
		POS1: for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break POS1;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		//변수값을 조정해 다중반복문 탈출
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					i = 100;
					break;
				}
				System.out.println();
			}
		}
		System.out.println();
	}
}