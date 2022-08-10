package sec01_array.EX08_NonRectangleArray;

public class NonRectangleArray {

	public static void main(String[] args) {
		//비정방 행렬의 선언 및 값 대입방법1
		int[][] array1 = new int[2][]; //열의 길이는 표시x
		array1[0] = new int[2]; // 첫번째 행 열의 개수: 2개
		array1[0][0] = 1; 
		array1[0][1] = 2;
		
		array1[1] = new int[3]; //두번째 행 열의 개수: 3개
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;
		
		System.out.println(array1[0][0] + " " + array1[0][1]); //1행
		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
		System.out.println();
		
		int[][] array2 = new int[2][];
		array2[0] = new int[] {1,2};
		array2[1] = new int[] {3,4,5};
		
		System.out.println(array2[0][0] + " " + array2[0][1]); //1행
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		
		
		
		
		
		//비정방 행렬의 선언 및 값 대입방법2
		int[][] array3 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array3[0][0] + " " + array3[0][1]);
		System.out.println(array3[1][0] + " " + array3[1][1]+ " " + array3[1][2]);
		System.out.println();
		
		int[][] array4;
		array4 = new int[][]{{1,2},{4,5,6}}; // 배열선언과 객체대입 분리가능
		System.out.println(array4[0][0] + " " + array4[0][1]);
		System.out.println(array4[1][0] + " " + array4[1][1]+ " " + array4[1][2]);
		System.out.println();
		
		for(int i=0; i<array3.length; i++) {
			for(int j=0; j<array3[i].length; j++) {
				System.out.println(array3[i][j]+ " " );
			}
		}
		
		System.out.println();	
		
		//비정방행렬의 선언 및 값 대입방법3
		int[][] array5 = {{1,2},{3,4,5}};
		System.out.println(array5[0][0] + " " + array5[0][1]);
		System.out.println(array5[1][0] + " " + array5[1][1]+ " " + array5[1][2]);
		System.out.println();
		
		
		
		/* 이렇게 대입은 안댐~ 
		  int[][] array6;
		  array6 = {{1,2},{3,4,5}};
	    */
	}

}
