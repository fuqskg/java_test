package sec03_methodoverriding.EX03_MethodOverriding_23;

class A{
	void print1() {
		System.out.println("A클래스 print1");
	}
	void print2() {
		System.out.println("A클래스 print2");
	}
}
class B extends A{
	@Override
	void print1() {
		System.out.println("B클래스 print1");
	}
	void print2(int a) {
		System.out.println("B클래스 print2");
	}
}
public class MethodOverriding_23 {

	public static void main(String[] args) {
		// A타입 선언 / A 생성자 사용
		A aa = new A();
		aa.print1(); //A클래스 print1
		aa.print2(); //A클래스 print2
		System.out.println();
		
		// B타입 선언 / B 생성자 사용
		B bb = new B();
		bb.print1(); //B클래스 print1
		bb.print2(); //A클래스 print2
		bb.print2(3); //B클래스 print2
		System.out.println();
		
		// A타입 선언 / B 생성자 사용
		A ab = new B();
		ab.print1(); // B클래스 print1 오버라이딩이 됐음->기준은 무조건 생성자
		ab.print2(); // A클래스 print2 A타입으로 선언됐으면 A에 있는 것만 출력
		//ab.print2(3) // B클래스 print2
		

	}

}
