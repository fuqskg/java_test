package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A{
	A(){
		System.out.println("A생성자");
	}
}

class B extends A{
	B(){
		super();//생략했을때 컴파일러가 자동추가 (부모클래스 생성자호출)
		System.out.println("B생성자");
	}
}

class C{
	C(int a){
		System.out.println("C생성자");
	}
}

class D extends C{
	/* 컴파일러가 자동으로 추가해주는 내용
	D(){
		super();
	}
	*/
	D(){
		super(3);
	}
}

public class SuperMethod_1 {

	public static void main(String[] args) {
		// A객체 생성
		A aa = new A();
		System.out.println();
		
		//B객체 생성
		B bb = new B();

	}

}
