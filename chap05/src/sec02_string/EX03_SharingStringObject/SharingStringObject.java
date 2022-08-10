package sec02_string.EX03_SharingStringObject;

public class SharingStringObject {

	public static void main(String[] args) {
		
		String str1 = new String("안녕1");
		String str2 ="안녕1";
		String str3 ="안녕1";
		String str4 = new String("안녕1");
		
		//스택메모리값 비교
		System.out.println(str1 == str2); //F
		System.out.println(str2 == str3); //T
		System.out.println(str3 == str4); //F
		System.out.println(str4 == str1); //F

	}

}
