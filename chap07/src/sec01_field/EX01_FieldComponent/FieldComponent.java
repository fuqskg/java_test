package sec01_field.EX01_FieldComponent;

//클래스 생성
class A {
	int m = 3; //필드
	int n = 4; //필드
	void work1() {
		int k = 5; //지역변수
		System.out.println(k);//5
		work2(3); // work2안에 저장된 지역변수를 스택메모리에 추가.
	}
	
	void work2(int i) { //인수를 변수 i에 대입해 입력매개변수로 활용
		int j = 4; //지역변수
		System.out.println(i + j); //7
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		// 클래스로 객체 생성
		A a = new A();
		
		//필드값 출력
		System.out.println(a.m);//3
		System.out.println(a.n);//4
		
		//메서드 호출
		a.work1();

	}

}
