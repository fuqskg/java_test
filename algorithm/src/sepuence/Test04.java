package sepuence;

public class Test04 {

	public static void main(String[] args) {
		// 수열 1/2~ 99/100 까지의 합
		float sum =0;
		for (float i=1; i<100; i++ ) { //분자
			if(i%2 == 0) { //짝수인경우
				sum += i / (i+1);
				System.out.println(i + "/" + (i+1)+ "까지의 합: " +sum );
			}
			else {
				sum -= i / (i+1);
				System.out.println(i + "/" + (i+1)+ "까지의 차: " +sum );

			}
			}
		
		

	}

}
