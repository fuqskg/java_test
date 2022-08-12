package sec04_thismethod.EX01_ThisMethod_1;
class A{
	A(){
		System.out.println("첫번째 생성자");
	}
	
	A(int a){
		this(); //반드시 첫줄, A()를 가리킴
		System.out.println("두번째 생성자");
	}
	/*
	void abc() {
		this();
	}*/  //메서드 안에서는 this() 사용 못 해~~
}
public class ThisMethod_1 {

	public static void main(String[] args) {
		//객체 생성
		A a1 = new A(); // 첫번째 생성자 호출
		
		System.out.println();
		
		A a2 = new A(3); // 두번째 생성자 호출(생성자 내부에서 첫번째 생성자 호출)
		

	}

}
