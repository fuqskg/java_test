package practice;
class A{
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	void print(int m) {
		System.out.println("정수 입력값: " + m );
	}
	void print(double m) {
		System.out.println("실수 입력값: " + m );
	}
	void print(String m) {
		System.out.println("문자열 입력값: " + m);
	}
	
}
public class Quiz02 {

	public static void main(String[] args) {
		A a = new A();
		
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("안녕");

	}

}
