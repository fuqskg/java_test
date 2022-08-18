package sepuence;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// 소수판별
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		for(int i = 2; i <number; i++) {
			if(number%i == 0 ) {
				System.out.println(number +": 소수가 아닙니다.");						
				return;

			}		
		}
		
		System.out.println(number +": 소수입니다.");
	}

}
