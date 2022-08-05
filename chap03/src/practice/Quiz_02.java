package practice;

public class Quiz_02 {

	public static void main(String[] args) {
		// 다음은 증감연산에 관한 코드이다. 출력값을 쓰시오.
		int a = 5;
		int b = a++;
		
		System.out.println(a);//6
		System.out.println(b);//5
		System.out.println(++a);//7
		System.out.println(++b);//6
		System.out.println(a++ + --b);//12
		System.out.println(a + b);//13

	}

}
