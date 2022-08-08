package practice;

public class Quiz_03 {

	public static void main(String[] args) {
		// 0 2 4 6 8 10이 출력되는 for문 작성(if, break, continue이용)
		
		for(int i=0; ; i++) {
			
			if(i % 2 == 1) {
				continue;		
				}
				
			if(i>10) {
				break;
			}
			System.out.println(i);
		}
	}
}
	