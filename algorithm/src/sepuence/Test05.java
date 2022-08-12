package sepuence;

public class Test05 {

	public static void main(String[] args) {
		// 항 사이 증가하는 값이 일정한 비유롤 증가하는 수열
		//1+2+4+7+11+16+22 ... 순서로 나열되는 수열의 20번째 항까지 합계
		//결과 : 1350
		int sum = 0;
		int i=1;
		int n=1;
		for(i=0; i<20; i++) {
			n += i;
			sum+=n;
			System.out.println("계차수열 "+ (i+1) +"항까지의 합: "+sum);
		}
		System.out.println("계차수열 20항까지의 합: "+sum);

	}

}
