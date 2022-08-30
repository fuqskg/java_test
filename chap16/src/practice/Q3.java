package practice;

class A{}
interface B{}

//A 또는 A 자식클래스만 제네릭 타입으로 지정 가능
class MyGenericA<T extends A>{

}
//B 또는 B 자식클래스만 제네릭 타입으로 지정 가능
class MyGenericB<T extends B>{
	
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
