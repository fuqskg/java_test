package sec01_field.EX01_InitialValueOfFieldAndLocalVariable;
//클래스 생성(정의)
class A{//필드 (강제초기화)-힙메모리라서
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1); //F
		System.out.println(m2); //0
		System.out.println(m3); //0.0
		System.out.println(m4); //null
	}
	void printLoclaVariable() {//지역변수(강제초기화x)
		int k;
		//System.out.println(k); 지역변수를 초기화안해서 오류
	}
}
public class InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		// 클래스를 활용해 객체생성
		A a = new A();
		
		//객체활용
		a.printFieldValue(); //클래스 내 void printFieldValue

	}

}
