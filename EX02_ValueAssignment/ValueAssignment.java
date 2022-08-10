package sec01_array.EX02_ValueAssignment;

public class ValueAssignment {

	public static void main(String[] args) {
		// 배열의 값 대입방법 1
		
		int[] array1 = new int[3]; //배열원소값 강제 초기화
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;

		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		
		int[] array2; // 배열 선언
		array2 = new int[3]; //객체대입 
		//배열 선언과 객체 대입을 분리 가능함.
		
		array2[0] = 4;
		array2[1] = 5;
		array2[2] = 6;

		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		System.out.println();
		
		//배열의 값 대입방법 2
		int[] array3 = new int[] {7,8,9}; //강제 초기화 생략
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
		
		int[] array4; //배열 선언
		array4 = new int[] {10,11,12}; //객체 대입
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);
	
		//배열의 값 대입방법 3
		int[] array5 = {13,14,15}; //강제초기화 생략
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		//불가능한 방법(배열 선언과 객체대입을 분리할 수 없음)
		//int[] array6;
		//array6 = {16,17,18}; 
		//System.out.println(array6[0] + " " + array6[1] + " " + array6[2]);
	
	
	
	}

}
