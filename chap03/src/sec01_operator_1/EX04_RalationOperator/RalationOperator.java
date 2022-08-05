package sec01_operator_1.EX04_RalationOperator;

public class RalationOperator {

	public static void main(String[] args) {
		//크기비교
		System.out.println(5 < 2); //F
		System.out.println(5 > 2); //T
		System.out.println(5 < 5); //F
		System.out.println(5 <= 2); //F
		System.out.println(5 >= 2); //T
		System.out.println();
	
		//등가비교 스택 메모리 값을 비교함
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b); //F
		System.out.println(a != b); //T
		System.out.println(a == c); //T
		System.out.println(a != c); //F
		System.out.println();
		
		//참조자료형 등가비교 (스택 메모리 값을 비교함)
		String str1 = new String("안녕");
		String str2 = new String("안녕");				
		System.out.println(str1 == str2); //F
	}
	
	

}
