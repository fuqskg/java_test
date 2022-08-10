package sec01_array.EX03_InitialValue;

import java.util.Arrays;

public class InitialValue {

	public static void main(String[] args) {
		// 스택메모리값(강제초기화되지 않음)
		int value1;
		// System.out.println(value1); - 오류 (스택메모리에 있는 변수는
		int[] value2; 
		// System.out.println(value2); - 오류   초기화 없이 출력x)
		
		int value3 = 0; // 0으로 초기화
		System.out.println(value3); //0
		int[] value4 = null;
		System.out.println(value4); //null
		System.out.println();
		
		
		//힙 메모리의 초깃값 ( 강제 초기화 )
		
		//기본 자료형 배열
		
		boolean[] array1 = new boolean[3];
		for(int i=0; i<3; i++) {
			System.out.println(array1[i] + " ");
			
		} //boolean 디폴트값 false로 초기화

		System.out.println();


		int[] array2 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println(array2[i] + " ");
		} //int 디폴트값 0으로 초기화
		System.out.println();
		
		double[] array3 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println(array3[i] + " ");
		} //double 디폴트값 0.0으로 초기화
		System.out.println();
		
		
		//참조자료형 배열
		
		String[] array4 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(array4[i]+ " " );
		} //참조자료형 디폴트값 null로 초기화
		System.out.println();
		System.out.println();
		
		//배열을 한번에 출력
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));

		
	}

}
