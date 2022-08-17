package sec02_typecasting.EX01_Typecasting_1;

//클래스의 상속 관계
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Typecasting_1 {
	public static void main(String[] args) {
		//업캐스팅(자동변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = (A) new C(); //c->a 업캐스팅(자동변환)
		B bc = (B) new C(); // c->b 업캐스팅(자동변환)
		
		B bb = new B();
		A a = (A) bb; //b->a 업캐스팅 (자동변환)
		
		//다운캐스팅 (수동변환) : 캐스팅이 불가능 할 때 ( 실행할 때 예외 발생)
		A aa = new A();
		//B b = (B) aa; //a->b 다운캐스팅 (수동변환) 불가능
		//C c = (C) aa; // a->c 다운캐스팅 (수동변환) 불가능
		
		//다운캐스팅 (수동변환) : 캐스팅이 가능할 때
		A ab = new B();
		B b = (B) ab; //a->b 다운캐스팅(수동변환)
		//C c = (C) ab; //a->c 다운캐스팅(수동변환):불가능
		
		B bd = new D(); 
		D d = (D) bd; //b->d다운캐스팅(수동변환)
		
		A ad = new D();
		B b1 = (B) ad;//a->b 다운캐스팅(수동변환)
		D d1 = (D) ad;//a->d 다운캐스팅(수동변환)
	}

}
