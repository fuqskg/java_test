package practice;

public class Q_3 {

	public static void main(String[] args) {
		// 현재쓰레드 객체 가져오기 + 스레드 이름 가져오기 + 스레드 개수
		Thread curThread = Thread.currentThread();
		System.out.println(curThread.getName());
		System.out.println(curThread.activeCount());
		//새로운 쓰레드 생성 + 쓰레드 이름 가져오기
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		//두번째 쓰레드 생성 + 쓰레드 이름 설정 + 스레드 이르 ㅁ가져오기
		Thread t2 = new Thread();
		t2.setName("두번째 쓰레드");
		System.out.println(t2.getName());
	}

}
