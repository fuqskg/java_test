package sec02_interface.EX07_defaultMethod_2;

interface A{
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}
class B implements A{
	public void abc() {
		A.super.abc();
		System.out.println("B클래스의 abc()");
	}
}
public class defaultMethod_2 {

	public static void main(String[] args) {
		//객체생성
		B b = new B();
		
		//메서드 호출
		b.abc();
	}

}
