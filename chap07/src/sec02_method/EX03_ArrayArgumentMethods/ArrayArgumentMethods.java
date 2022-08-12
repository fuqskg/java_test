package sec02_method.EX03_ArrayArgumentMethods;

import java.util.Arrays;

public class ArrayArgumentMethods {

	public static void main(String[] args) {
		// 배열을 입력 매개변수로 하는 메서드 호출
		int[] a = new int[] {1,2,3};
		printArray(a); //[1,2,3]
		printArray(new int[] {1,2,3});
		//printArray({1,2,3}); 오류발생

	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a)); //[1,2,3]
		System.out.println(a[1]); //2
	}

}
