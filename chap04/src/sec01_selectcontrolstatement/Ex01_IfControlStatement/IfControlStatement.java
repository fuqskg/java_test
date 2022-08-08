package sec01_selectcontrolstatement.Ex01_IfControlStatement;

public class IfControlStatement {

	public static void main(String[] args) {
		// 유형1 :if
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1");
			
		} //실행됨
		if (value1 < 5) {
			System.out.println("실행2");
		} // 실행안됨 (조건이 안맞음)
		
		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1) {
			System.out.println("실행3");
		}//실행
		if (bool2) {
			System.out.println("실행4");
		}//실행안됨 (false이기때문에)
		
		//유형2 if-else
		int value2 = 5;
		if(value2 > 3) {
			System.out.println(("실행5"));
		} //실행
		else {
			System.out.println("실행6");
		}//실행안됨
		
		//cf. 삼항연산자와 변환가능
		System.out.println((value2 > 3) ? "실행5":"실행6"); //실행5
		System.out.println();
		
		//유형3 if-else if ... else
		int value3 = 85;
		if (value3 >= 90) { 
			System.out.println("A학점");
			}
		else if (value3 >= 80) { //실행됨
			System.out.println("B학점");
			}
		else if (value3 >= 70) {
			System.out.println("C학점");
			}
		else {
			System.out.println("F학점");
		}
		
		if (value3 >= 70) { // 실행 후 탈출
			System.out.println("C학점"); //실행됨 (여기서 조건이 충족됐음)
		}
		else if (value3 >= 80) { //실행하지않음
			System.out.println("B학점");
		}
		else if (value3 >= 90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
		
		
		if (value3 >= 70 && value3 < 80) {
			System.out.println("C학점");
		}
		else if (value3 >= 80 && value3 < 90) {
			System.out.println("B학점");//실행한 후 탈출
		}
		else if (value3 >= 90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
		
		
	}

}
