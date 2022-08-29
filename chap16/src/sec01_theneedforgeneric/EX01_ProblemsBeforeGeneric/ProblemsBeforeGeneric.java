package sec01_theneedforgeneric.EX01_ProblemsBeforeGeneric;

//Apple클래스와 Apple 클래스를 담을 수 있는 Goods 클래스
class Apple{}
class Goods1{
	private Apple apple = new Apple();
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

//Pencil 클래스와 Pencil클래스를 담을 수 있는Goods2클래스
class Pencil{}
class Goods2{
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil =pencil;
	}
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		// Goods1을 이용해 Apple 객체를 추가하거나 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple()); // Apple타입만 입력가능
		Apple apple = goods1.getApple(); // Apple타입 리턴
		
		// Goods2를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil()); // Pencil타입만 입력가능
		Pencil pencil = goods2.getPencil(); //Pencil타입 리턴

	}

}
