package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

import java.awt.desktop.AboutEvent;

class A{
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A클래스 메서드 abc()");
	}
	
	//인스턴스 이너클래스
	class B{
		void bcd() {
			//아우터클래스의 필드사용
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//아우터클래스의 메서드 호출
			abc();
		}
	}
}


public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		// 아우터클래스 객체생성
		A a = new A();
		
		//멤버사용
		A.B b = a.new B();
		b.bcd();

	}

}
