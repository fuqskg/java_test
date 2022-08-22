package sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

class A{
	int a = 3; //필드
	void abc() {
		int b = 5; // 지역변수
		
		//지역이너클래스
		class B{
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				//b = 7; 지역이너클래스에서 사용하는 지역변수는 자동 final선언( 수정불가 )
			}
		}
		B bb = new B();
		bb.bcd();
	}
}
public class AccessMemberAndLocalVariable {

	public static void main(String[] args) {
		// 객체생성 및 메서드 호출
		A a = new A();
		a.abc();

	}

}
