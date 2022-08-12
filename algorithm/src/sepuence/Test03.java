package sepuence;

import java.text.DecimalFormat;

public class Test03 {

	public static void main(String[] args) {
		DecimalFormat dc = new DecimalFormat("#,###");
		int n = 10;
		
		int j = 0;
		double tot = 1;
		while(j<n) {
		    j++;;
		
		    if(j%2==0) 
		    	tot *= j;	
			
			else 
				tot *= j * (-1);
			
			String ch = dc.format(tot);
			System.out.printf(" %3d까지의 곱 : %15s\n", j ,ch);
		    }
		    
		System.out.printf(" %11.4e\n", tot);
		}
	}



