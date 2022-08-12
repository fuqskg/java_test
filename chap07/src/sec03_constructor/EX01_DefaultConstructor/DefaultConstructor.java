package sec03_constructor.EX01_DefaultConstructor;
class A{
	int m; //강제로 초기화가 됐음
	void work() {
		System.out.println(m);
	}
	/*
	A(){
		
	}
	*/ // 생성자를 포함하지 않으면 컴파일러가 기본 생성자를 자동으로 추가
}

class B{
	int m; //강제로 초기화가 됐음
	void work() {
		System.err.println(m);
	}

	B(){
		
	} //기본생성자를 직접 정의
}

class C{
	int m;
	void work() {
		System.out.println(m);
	}
	
	C(int a){//입력매개변수를 포함하고 있는 생성자 정의
		m = a; //입력매개변수로 전달된 값으로 필드 초기화
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		//클래스의 객체 생성
		A a = new A();//컴파일러가 자도응로 추가한 기본생성자를 호출해 객체 생성
		B b = new B();//직접 정의한 기본 생성자를 호출해 객체생성
		//C c = new C(); 기본생성자 호출 불가능
		C c = new C(5);//직접 정의한 생성자를 호출해 객체생성

		//메서드 호출
		a.work();
		b.work();
		c.work();
	}

}
