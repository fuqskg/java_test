package sec04_controlkeyword.EX02_ContinueControlKeyword;

public class ContinueControlKeyword {

	public static void main(String[] args) {
		// 단일 	반복문에서 continue 사용
		for(int i=0; i<10; i++) {
			continue; //여기서 끝나버려서 출력문을 실행하지 않음.
//			System.out.println(); unreachable code오류 발생
		}
		
		
		for(int i=0; i<10; i++) {
			System.out.println(i + " ");
			continue;
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue; //i=5면 건너뜀
			}
			System.out.println(i+ " ");
			
		}
		System.out.println();

		
		//다중반복문에서 continue사용
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue; //j=3이면 건너뜀
				}
				System.out.println(i + ", "+ j);
			}
		}
		System.out.println();
	
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue POS1;
				}
				System.out.println(i + " "+ j);
			}
		}

	
	}
	

}
