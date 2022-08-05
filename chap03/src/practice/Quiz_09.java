package practice;

public class Quiz_09 {

	public static void main(String[] args) {
		// 삼항연산자에 관한 코드이다. 출력값을 쓰시오.
		int a = 3;
		int b = 5;
		int c = 7;
		
		System.out.println((a>b) ? "안녕하세요":"반갑습니다."); //반갑습니다
		System.out.println((a<b) ? (b>c) ? "타입A":"타입B": (b>c) ? "타입C":"타입D");
		//타입B
	}

}
