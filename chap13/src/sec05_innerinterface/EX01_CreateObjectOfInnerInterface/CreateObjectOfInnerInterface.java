package sec05_innerinterface.EX01_CreateObjectOfInnerInterface;

class A {
	interface B{
		public abstract void bcd();
	}
}

class C implements A.B{
	public void bcd() {
		System.out.println("이너인터페이스 구현 클래스 생성");
	}
}
public class CreateObjectOfInnerInterface {

	public static void main(String[] args) {
		// 객체 생성 방법 1
		A.B ab = new C();
		C c = new C();
		c.bcd();
		
		// 객체 생성 방법 2
		A.B b = new A.B() {
			public void bcd() {
				System.out.println("익명 이너클래스로 객체 생성");
			}
		};
		b.bcd();
	}

}
