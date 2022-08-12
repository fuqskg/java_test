package sec02_method.EX04_EffectOfPrimaryDataArgument;

public class EffectOfPrimaryDataArgument_2 {
	//힙영역(값이 그대로 ! ! )
	public static void main(String[] args) { //a= main()함수의 지역변수
		int a = 3;
		int result1 = twice(3);
		System.out.println(result1); //6
		
		int result2 = twice(a);
		System.out.println(result2); //6
		System.out.println(a); //3
	}
	 
	//스택영역 ( 복사할때마다 값이 변경 )
	public static int twice(int a) { //a = twice()메서드의 지역변수
		a = a * 2;
		return a;
		
	}

}
