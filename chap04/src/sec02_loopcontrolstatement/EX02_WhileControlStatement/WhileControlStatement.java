package sec02_loopcontrolstatement.EX02_WhileControlStatement;

public class WhileControlStatement {

	public static void main(String[] args) {
		// while의 기본 문법 구조
		int a = 0;
		while (a<10) {
			System.out.println(a + " "); //a가 0인상태에서 연산
			a++; // 1증가
		}
		System.out.println();
		
		//for문으로 변환
		for(int i=0; i<10; i++) {
			System.out.println(i + " ");
		} 
		System.out.println();
		
		int b = 10;
		while(b>0) {
			System.out.println(b + " ");
			b--;
		}
		
		System.out.println();
		
		//for문으로 변환
		for(int i=10; i>0; i--) {
			System.out.println(i + " ");
		}
		
		//while문으로 만든 무한루프
		/*
		while(true) {
			System.out.println("무한루프");
		}
		*/
		System.out.println();
		
		//무한루프 탈출
		
		int c=0;
		while(true) {
			if(c>10) {
				break;
			}
			System.out.println();
			c++;
		}
		

	}

}
