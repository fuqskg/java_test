package sepuence;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mul = 1;
		int sum = 0;
		
		for ( int i=1; i<=10; i++ ) {
			mul *= i;
			sum += mul;
			System.out.println(i+"!까지의 합(for) = "+ sum);
			
		}
		
		int a = 1;
		int b = 1;
		int sum1 = 0;
		while(a <= 10) {
			
			b *= a;
			sum1 += b;
			System.out.println(a + "!까지의 합(while) = "+ sum1);
			a++;
			
		}
	
	}

}
