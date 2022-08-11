package sec02_string.EX05_MethodOfString_1;

import java.util.Arrays;

public class MethodOfString_1 {

	public static void main(String[] args) {
		// 문자열 길이
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());//11
		System.out.println(str2.length());//13
		System.out.println();
		
		//문자열 검색 
		//charAT()
		System.out.println(str1.charAt(1));// 인덱스 1의문자:e
		System.out.println(str2.charAt(1));// 인덱스 1의문자:녕
		System.out.println();
		
		//indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a')); //앞에서부터 a가위치한인덱스:7
		System.out.println(str1.lastIndexOf('a'));//뒤에서부터 a가위치한인덱스:9
		System.out.println(str1.indexOf('a',8));
		System.out.println(str1.lastIndexOf('a',8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye")); //문자열이 없는경우 -1 리턴
		System.out.println(str2.lastIndexOf("고맙습니다"));
		System.out.println();

		
		//문자열 변환 및 연결
		//String.valueOf(기본자료형->문자열로 반환)
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
	
		//concat() 문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5 );//2.3false
		
		//String.valueOf + concat()
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3));
		
		//문자열을 bate[]또는char[]로 변환
		String str8 = "Hello Java!";		
		String str9 = "안녕하세요";
		
		//getBytes() 문자열-> byte[]변환
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//toCharArray()문자열 -> char[]변환
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
	}

}