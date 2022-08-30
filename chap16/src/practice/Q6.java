package practice;

class A6<K>{
	K k;
	public void setK(K k) {
		this.k = k;
	}
}

class B6<T, V> extends A6<T>{
	V v;
	public void setV(V v) {
		this.v = v;
	}
	
	public void print() {
		System.out.println(k + ": " + v);
	}
}

public class Q6 {

	public static void main(String[] args) {
		B6<Integer, String> b = new B6<>();
		b.setK(1);
		b.setV("감자");
		b.print();

	}

}
