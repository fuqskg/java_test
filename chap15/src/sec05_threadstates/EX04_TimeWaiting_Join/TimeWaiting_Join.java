package sec05_threadstates.EX04_TimeWaiting_Join;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 1000000000L; i++) {}
	}
}

class MyThread2 extends Thread{
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {
			myThread1.join(3000); // myThread1 에게 최대 3초동안 cpu우선사용권 부여
		} catch (InterruptedException e) {
			System.out.println(" -- join (...) 진행 중 interrupt() 발생");
			for (long i = 0; i < 1000000000L; i++) {} // 시간지연
		}
	}
}
public class TimeWaiting_Join {

	public static void main(String[] args) {
		//객체생성
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(100);} catch(InterruptedException e) {} //쓰레드 시작 준비시간
		System.out.println("MyTread1 State = " + myThread1.getState());
		System.out.println("MyTread2 State = " + myThread2.getState());
		
		//TIME_WAITING
		myThread2.interrupt();
		try {Thread.sleep(100);} catch (InterruptedException e) {} // 인터럽트 준비시간
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());

	}

}
