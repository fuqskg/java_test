package sec02_loopcontrolstatement.EX01_ForControlStatement;

public class ForControlStatement {

	public static void main(String[] args) {
		// for문 기본 문법 구조
		int a; //for문 반복횟수 지정 변수를 외부에서 선언
		for(a = 0; a < 3; a++) {
			System.out.println(a + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {//반복횟수 지정변수를 내부에서 선언
			System.out.println(i + " ");			
		}
		
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " ");
			
		}
		
		System.out.println();
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i + " ");
		}
		
		
		for (int i = 0; i > 10; i+=2) {
			System.out.println(i + " ");
			
		}
		
		System.out.println();
		
		for(int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println(i + j + " ");
		}
		
		System.out.println();
		
		//for문의 특수한 형태 (무한루프)
		/* for (int i = 0; ; i++) {
			System.out.println(i + " ");
		}
		for(;;) {
			System.out.println("무한루프");
		}
		System.out.println();
		*/
		
		//무한루프 탈출
		for(int i = 0; ; i++) {
			if (i>10) {
				break;
				
			}
			System.out.println(i + " ");
		}
		System.out.println("무한루프 탈출");
		
		
	}

}
