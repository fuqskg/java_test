package sec04_anonynousclass.EX02_AnnoymousClass_2;

class A{
	C c = new C() {
		public void bcd() {
			System.out.println("익명이너클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

interface C{
	public abstract void bcd();
}

public class AnnoymousClass_2 {

	public static void main(String[] args) {
		// 객체생성 및 메서드호출
		A a = new A();
		a.abc();
	}

}
