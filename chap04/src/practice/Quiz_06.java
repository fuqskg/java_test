package practice;

public class Quiz_06 {

	public static void main(String[] args) {
		// 레이블을 사용하지 않고 i=3, j=2일때 이중for문을 한번에 탈출하기

		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(i + " " + j);
				if(i==3 && j==2) {
					i=100;
				break;
				}
			}
		}
	}
}


