package sec04_anonynousclass.EX03_AnnoymousClass_3;

interface A{
	public abstract void abc();
}
//자식클래스 직접생성
class B implements A{
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}
class C{
	void cde(A a) {
		a.abc();
	}
}
public class AnnoymousClass_3 {

	public static void main(String[] args) {
		C c = new C();
		//방법 1. 클래스명 ㅇ + 참조변수명 ㅇ
		A a = new B();
		c.cde(a);
		
		//방법 2. 클래스명 ㅇ + 참조변수명 ㄴ
		c.cde(new B());

	}

}
