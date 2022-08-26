package practice;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			System.out.println(i + "초");
		}
	}
}
public class Q_2 {

	public static void main(String[] args) {
		MyRunnable rn = new MyRunnable();
		Thread myThread = new Thread(rn);
		
		myThread.start();

	}

}
