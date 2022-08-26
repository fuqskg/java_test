package sec04_userexception.EX02_ExceptionMethod_1;

public class ExceptionMethod_1 {

	public static void main(String[] args) {
		// 1. 예외 객체를 생성했을 때 메시지를 전달하지 않았을 경우
		try {
			throw new Exception(); // 예외발생
			
		} catch(Exception e) {
			System.out.println(e.getMessage()); //null
		}

		// 2. 예외 객체를 생성했을 때 메시지를 전달했을 경우
		try {
			throw new Exception("예외 메시지"); // 예외발생
			
		} catch(Exception e) {
			System.out.println(e.getMessage()); // 예외 메시지
		}
	}

}