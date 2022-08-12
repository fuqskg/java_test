package sec04_thiskeyword.EX01_ThisKeyword_2;

class A{
	int m;
	int n;
	void init(int a, int b) {
		m=m; //this가 없어서 구분을 하지 못함. 지역변수로 인식됨. 0으로 초기화 된상태로 남게 됨
		n=n; //this가 없어서 구분을 하지 못함. 지역변수로 인식됨. 0으로 초기화 된상태로 남게 됨
	}
}

class B{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
		
	}
}
public class ThisKeyword_2 {

	public static void main(String[] args) {
		// 필드명과 지역변수명이 같고 this키워드를 사용하지 않음
		A a = new A();
		a.init(2,3);
		System.out.println(a.m);//0
		System.out.println(a.n);//0
		
		//필드명과 지역 변수명이 같고 this키워드를 사용함
		B b = new B();
		b.init(2,3);
		System.out.println(b.m);//2	
		System.out.println(b.n);//3

	}

}
