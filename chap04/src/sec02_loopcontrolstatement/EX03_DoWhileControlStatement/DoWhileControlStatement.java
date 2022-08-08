package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

public class DoWhileControlStatement {

	public static void main(String[] args) {
		// 반복횟수가 0일때 do-while문과 while문 비교.
		int a = 0;
		while(a<0) {
			System.out.println(a + " ");
			a++;
		} //실행횟수 0번 
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		} while(a<0); //실행횟수 1번
		System.out.println();
		
		//반복횟수가 1일 때 do-while문과 while문 비교
		a = 0;
		while(a<1) {
			System.out.println(a + " ");
			a++;
		}//실행횟수 1번
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a<1); //실행횟수 1번
		System.out.println();
		
		//반복횟수가 10일때 do-while문과 while문 비교
		a = 0;
		while(a<10) {
			System.out.println(a + " ");
			a++;
		}//실행횟수 10번
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a<10); //실행횟수 10
		System.out.println();
		
		
		
	}

}
