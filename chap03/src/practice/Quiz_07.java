package practice;

public class Quiz_07 {

	public static void main(String[] args) {
		// 논리연산자와 비트연산자로 논리연산을 수행한 코드다. 출력값을쓰시오
		int a = 4 ,b = 5, c = 6;
		System.out.println(false && a-- > 6); //F
		System.out.println(true | b++ > 6); // T
		System.out.println(true ^ c++ > 6); //T
		System.out.println(a); //4 ( 3이 아닌 이유는 쇼트 서킷때문)
		System.out.println(b); //6
		System.out.println(c); //7

	}

}
