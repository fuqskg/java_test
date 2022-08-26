package practice;

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("첫번째 출력");
			Thread.sleep(1000);
			System.out.println("두번째 출력");
			Thread.sleep(1000);
				System.out.println("세번째 출력");
		Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("쓰레드 종료");
		}
	}
}
public class Q_6 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {Thread.sleep(1500);} catch(InterruptedException e) {}
		mt.interrupt();

	}

}
