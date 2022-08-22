package sec01_instanceinnerclass.EX02_UseMenbersOfOuterClass;

class A{
	int a = 3;
	int b = 4;
	void abc(){
		System.out.println("A클래스 메서드");
	}
	//인스턴스 이너클래스 정의
	class B{
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B클래스 메서드");
		}
		
		void bcd() {
			//이너클래스의 멤버호출 또는 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			//아웃클래스의 멤버호출 또는 사용
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}


public class UseMenbersOfOuterClass {

	public static void main(String[] args) {
		// 아웃클래스 객체생성
		A a = new A();
		
		// 이너클래스 객체생성
		A.B b = a.new B();
		b.bcd();
		}

}
