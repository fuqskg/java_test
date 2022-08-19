package sec02_abstractmodifier.EX02_AbstractModifier_2;

abstract class Animal{ //추상메서드를 1개이상 포함하고 있으므로 추상클래스로 정의
	abstract void cry();//추상메서드
}

class Cat extends Animal{
	void cry(){
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}
public class AbstractModifier_2 {

	public static void main(String[] args) {
		//객체생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//메서드 호출
		animal1.cry();
		animal2.cry();

	}

}
