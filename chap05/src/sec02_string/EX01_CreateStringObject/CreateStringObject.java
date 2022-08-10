package sec02_string.EX01_CreateStringObject;

public class CreateStringObject {

	public static void main(String[] args) {
		//String 객체 생성 1
		
		String str1 = new String("안녕");
		System.out.println(str1);
		
		//String 객체 생성 2

		String str2 = "안녕안녕";
		System.out.println(str2);
		
		//String 객체 생성 3
		
		String str3; //스택메모리
		str3 = "안녕안녕안녕"; // 힙메모리
		System.out.println(str3);
	}

}
