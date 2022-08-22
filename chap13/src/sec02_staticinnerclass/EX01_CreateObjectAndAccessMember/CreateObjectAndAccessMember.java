package sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;


class A{
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	
	static void method2() {
		System.out.println("static method");
	}
	
	//정적 이너클래스
	static class B{
		void bcd() {
			//필드사용
			//System.out.println(a); 정적이너클래스는 아웃클래스의 정적멤버만 사용 가능
			System.out.println(b);
			
			//메서드호출
			//method1(); 정적이너클래스는 아웃클래스의 정적멤버만 사용 가능
			method2();
		}
	}
}

public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		//정적 이너클래스의 객체생성
		A.B b = new A.B();
		
		//메서드 호출
		b.bcd();

	}

}
