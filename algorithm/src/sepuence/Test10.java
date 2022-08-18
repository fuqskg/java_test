package sepuence;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// 약수구하기
		Scanner scanf = new Scanner(System.in);
		int[] a = new int[100];
		int n = scanf.nextInt(); 
		int k = 0;
		
		for(int i = 1; i < n; i++) {
			if(n%i == 0) {
				a[i] = k;
				System.out.println("약수: " + i);
				
			}
			
		
		}
		

	}

}
