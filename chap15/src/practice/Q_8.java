package practice;

class MyData{
	boolean flag = false;
	synchronized void printA() {
		if(flag) {
			try {wait();} catch (InterruptedException e) {}
		}
		flag =  true;
		System.out.println("A");
		notify();
		
	}
	
	synchronized void printB() {
		if(!flag) {
			try {wait();} catch(InterruptedException e) {}
		}
		flag = false;
		System.out.println("B");
		notify();
		
	}
	
}

class ThreadA extends Thread{
	MyData myData;
	public ThreadA (MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			myData.printA();
			try {Thread.sleep(500);} catch(InterruptedException e) {}
		}
	}
}

class ThreadB extends Thread{
	MyData myData;
	public ThreadB (MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			myData.printB();
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
public class Q_8 {

	public static void main(String[] args) {
		MyData myData = new MyData();
		Thread t1 = new ThreadA(myData);		
		Thread t2 = new ThreadB(myData);
		
		t1.start();
		t2.start();

	}

}
