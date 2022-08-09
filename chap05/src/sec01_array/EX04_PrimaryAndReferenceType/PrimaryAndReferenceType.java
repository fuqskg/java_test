package sec01_array.EX04_PrimaryAndReferenceType;

import java.util.Arrays;

public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		//기본자료형 대입연산 (stack값 복사)
		int value1 = 10;
		int value2 = value1;
		
		value2 = 20;
		
		System.out.println(value1); //10
		System.out.println(value2); //20 (방이 복사돼서 원본값이 달라지지 않음)
		
		System.out.println();
		
		
		//참조자료형의 대입연산		
		int[] array1 = new int[] {30,40,50};
		int[] array2 = array1;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		array2[0] = 500;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2)); //(같은 주소이기때문에 원본값이 변경됨)

	}

}
