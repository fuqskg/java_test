package sec01_array.EX06_RectangleArrayDefinition;

public class RectangleArrayDefinition {

	public static void main(String[] args) {
		//2차원배열 선언방법
		
		//선언방법 1
		int [][] array1 = new int [3][4];
		int [][] array2;
		array2 = new int[3][4];
		
		
		//선언방법 2 (대괄호가 변수명 뒤에)
		int array3[][] = new int [3][4];
		int array4[][]; 
		array4 = new int [3][4];
		
		
		//다양한 배열 선언방법(기본자료형, 참조자료형)
		boolean[][] array7 = new boolean[3][7];
		int[][] array8 = new int[3][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6];
		
		
		
	}

}
