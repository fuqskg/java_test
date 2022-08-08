package practice;

public class Quiz_05 {

	public static void main(String[] args) {
		// A는 몇번 출력되는가???
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(i==2) {
					continue;
				}
				if(j==1) {
					break;
				}
				System.out.println("A");
			}
		}

	}

}
