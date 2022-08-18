package sepuence;

public class Test07 {

	public static void main(String[] args) {
		// 피보나치 수열의 합계 (20번째 항까지)
		
		int n3 = 0;
		int n2 = 1;
		int n1 = 0;
		int sum = 1;
		System.out.println("피보나치1항: 1");//1항은 for문으로 계산이 안돼서 빼놓음
		System.out.println("누계 합: 1");
		for( int i = 1; i < 20; i++) {
			n3 = n1 + n2; //피보나치 정의: F(n)= (n-1) + (n-2)
			System.out.println("피보나치" + (i+1) +"항: " + n3);
			sum += n3;
			n1 = n2; //값을 전 항으로 넘김
			n2 = n3; // 값을 전 항으로 넘김
			System.out.println("누계 합: " + sum);
			
			}
		System.out.println("20항까지의 합: " + sum);
		}

	}


