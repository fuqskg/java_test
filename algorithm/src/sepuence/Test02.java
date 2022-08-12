package sepuence;

public class Test02 {

	public static void main(String[] args) {
		//100까지 홀수 합계 계산하기 (while)
		
		int n = 0;
		int sum = 0;
		while(n<=100) {
			if(n%2==1) {
				sum += n;
			}
		
			n++;
		}
		System.out.println("(while)1에서 100까지 홀수의 합: " + sum);
		
		//for문으로 홀수합계
		
		int i;
		int sum1 = 0;
		for(i=1; i<=100; i++) {
			if(i%2==1) {
				sum1 += i;
			}
		}
		System.out.println("(for)1에서 100까지 홀수의 합: " + sum1);
		
		
		//짝수 합계
		int tot = 0;
		int m = 0;
		while(m<=100) {
			if(m%2==0) {
				tot += m;
			}
			m++;
		}
		System.out.println("(while)1에서 100까지 짝수의 합: " +tot );

		
		//(for) 짝수 합계
		
		int j;
		int tot1 = 0;
		for(j=0; j<=100; j+=2) {
			tot1+=j;
			
		}
		System.out.println("(for)1에서 100까지 짝수의 합: " + tot1);
	}

}
