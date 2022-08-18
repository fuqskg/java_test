package sec04_overlapmember.EX02_OverlapStaticField;

class A{
	static int m = 3;
}

class B extends A{
	static int m = 4;
}

public class OverlapStaticField {

	public static void main(String[] args) {
		// 클래스명으로 바로 접근
		System.out.println(A.m); //3
		System.out.println(B.m); //4
		System.out.println();
		
		
		//객체생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//생성한 객체로 정적필드 호출
		System.out.println(aa.m); //3
		System.out.println(bb.m); //4
		System.out.println(ab.m);

	}

}
