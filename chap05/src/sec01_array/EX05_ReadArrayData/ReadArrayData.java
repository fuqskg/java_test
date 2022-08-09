package sec01_array.EX05_ReadArrayData;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		//배열의 길이 구하기
		System.out.println(array.length); //5
		System.out.println();
		
		//출력하기
		System.out.println(array[0] + " "); // 0번방에 있는 값
		System.out.println(array[1] + " "); // 1번방에 있는 값
		System.out.println(array[2] + " "); // 2번방에 있는 값
		System.out.println(array[3] + " "); // 3번방에 있는 값
		System.out.println(array[4] + " "); // 4번방에 있는 값

		System.out.println();
		System.out.println();
		
		//출력하기 2 (for문)
		for(int i=0; i<5; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
		
		//출력하기 3 (for each문)
		for (int k : array) {
			System.out.println(k + " ");			
		}
		
		
		
		//출력하기 4
		System.out.println(Arrays.toString(array));
	}

}
