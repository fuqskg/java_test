package sepuence;
public class Test01 {

	public static void main(String[] args) {
		// 수열, 1~100까지의 합계 (for문)
		
		int sum = 0;
		int i=1;
		for(i=1; i<=100; i++) {
			sum += i;
			
		}
		System.out.println("1~100까지 합계: " + sum);

		//while문
		int n=1;
		int tot = 0;
		while (n>0) {
			tot += n;
			n++;
			if(n>100) {
				break;
			}
		}
		System.out.println("1~100까지 합계: "+tot);
	}

}
