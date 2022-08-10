package practice;

public class Quiz_05 {

	public static void main(String[] args) {
		int [][] a = new int[2][];
		a[0] = new int[3];
		a[0][0]=1;
		a[0][1]=3;
		a[0][2]=5;
		
		a[1] = new int[2];
		a[1][0]=7;
		a[1][1]=9;
		
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}

}
