package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

class A {
	void abc() {
		System.out.println("A믈래스의 abc()");
	}
}

class B extends A{
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		abc(); //this.abc();
	}
}
public class SuperKeyword_1 {

	public static void main(String[] args) {
		//객체생성
		B bb = new B();
		
		//메서드
		bb.bcd();

	}

}
