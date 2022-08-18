package sec06_objectclass.EX02_ObjectMethod_equals;

class A{
	String name;
	A(String name){
		this.name = name;
	}
}

class B{
	String name;
	B(String name){
		this.name =name;
	}
	
	@Override //위치가 아닌 실제내용을 비교하고자 할땐 오버라이딩 해야함
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		}
		else {
			return false;
		}
		
	}
}

public class equals {

	public static void main(String[] args) {
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		System.out.println(a1 == a2); //F
		System.out.println(a1.equals(a2)); //F
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		System.out.println(b1 == b2);//F
		System.out.println(b1.equals(b2));//T

	}

}
