package sec02_string.EX05_MethodOfString_2;

import java.beans.JavaBean;
import java.util.Arrays;

public class MethodOfString_2 {

	public static void main(String[] args) {
		// 문자열 수정
		// toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); //모두 소문자로
		System.out.println(str1.toUpperCase()); //모두 대문자로
		
		//replace()
		System.out.println(str1.replace("Study", "공부"));// Java 공부

		//substring()
		System.out.println(str1.substring(0, 5));//인덱스 0~4 문자열
		
		//split()
		String[] strArray = "abc/def-ghi jkl".split("/|-| "); // /또는-또는 공백으로 구분된 문자열 배열 반환
		System.out.println(Arrays.toString(strArray));
		
		//trim()
		System.out.println("    abc    ".trim()); //좌우공백제거
		System.out.println();
		
		//문자열 내용 비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//stack메모리 비교 (==) : 위치(번지수)비교
		System.out.println(str2 == str3); //F
		System.out.println(str3 == str4); //F
		System.out.println(str4 == str2); //F
		
		//equals(), equalsIgnoreCase(): 내용비교
		System.out.println(str2.equals(str3));//T
		System.out.println(str3.equals(str4));//F
		System.out.println(str3.equalsIgnoreCase(str4));//T
	
	
	}

}
