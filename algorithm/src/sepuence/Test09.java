package sepuence;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		int a, hap, k, j, i;
		int[] sosu = new int[10];
		a = 20;
		hap = 0;
		k = 2;
		i = 0;
		while (true) {
			j = 2;
			while(k%j != 0)
				j++;
			
			if( k == j )
				sosu[i] = k;
				i++;
				hap += k;
				System.out.printf("소수: %2d까지의 합: %3d\n",k,hap);
			if(k<a)
				k++;
			else {
				System.out.printf("최종합계 : %d",hap);
				break;
			}
		}
		System.out.println();
		for(int m = 0; m < 10; m++) {
			if(sosu[m] == 0) break;
			System.out.println(sosu[m] + " ");
		}
	}

}
