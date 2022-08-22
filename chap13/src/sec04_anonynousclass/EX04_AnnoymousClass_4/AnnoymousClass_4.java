package sec04_anonynousclass.EX04_AnnoymousClass_4;

interface A{
	public abstract void abc();
}
class C{
	void cde(A a) {
		a.abc();
	}
}


public class AnnoymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		// 방법 3. 클래스명 ㄴ + 참조변수명 
		A a = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		c.cde(a);
		
		//방법 4. 클래스명 ㄴ + 참조변수명 ㄴ
		c. cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
				
			}
		});
	}

}
