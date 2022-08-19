package sec02_interface.EX08_StaticdMethod;

interface A{
	static void abc() {
		System.out.println("A 인터페이스의 정적메서드abc()");
	}
}


public class StaticdMethod {

	public static void main(String[] args) {
		// 정적메소드 호출
		A.abc();
	}

}
