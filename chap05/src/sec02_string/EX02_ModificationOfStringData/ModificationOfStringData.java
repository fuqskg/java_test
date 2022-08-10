package sec02_string.EX02_ModificationOfStringData;

import java.util.Arrays;

public class ModificationOfStringData {

	public static void main(String[] args) {
		// 문자열 수정
		String str1 = new String("ㅎㅇㅎㅇ");
		String str2 = str1; //복사
		str1 = "하이하이";//수정(새로운 객체 생성)
		
		System.out.println(str1); //하이하이		
		System.out.println(str2); //ㅎㅇㅎㅇ ( 수정안됨 )
		
		
		//배열 참조 자료형
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array1[0] = 7;
		array1[1] = 8;
		array1[2] = 9;

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
	}

}
