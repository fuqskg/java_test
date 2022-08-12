package sec02_method.EX04_EffectOfPrimaryDataArgument;
class A{
	int twice(int a) {
		a = a * 2;
		return a;
	}
}
public class EffectOfPrimaryDataArgument {
	public static void main(String[] args) { //a= main()함수의 지역변수
		A a = new A();
		int b = 3;
		int result1 = a.twice(3);
		System.out.println(result1); //6
		
		int result2 = a.twice(b);
		System.out.println(result2); //6
		System.out.println(b); //3
	}

}
