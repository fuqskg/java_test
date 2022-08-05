package sec01_operator_1.EX03_ShiftOperator;

public class ShiftOperator {

	public static void main(String[] args) {
		// 산술시프트
		// <<
		System.out.println(3 << 1); //6       0000 0011< 0110
		System.out.println(-3 << 1); //-6     1111 1101< 1010
		System.out.println(3 << 2); //12      0000 1100 
		System.out.println(-3 << 2); //-12    0000 0100
		System.out.println();
		
		// >>
		System.out.println(5 >> 1); //2   (버림)    0000 0101 >> 0010
		System.out.println(-5 >> 1); //-3 (올림)    1111 1011 >> 1101
		System.out.println(5 >> 2); //1   (버림)    0000 0001
		System.out.println(-5 >> 2); //-2 (올림)    1111 1110
		System.out.println();
		
		//논리시프트 (>>>)
		System.out.println(3 >>> 1); //1      0000..0011 >>> ...0001 
		System.out.println(-3 >>> 31); //1 (전체가32bit)   1111..1101 >>>  
		
		//논리시프트를 이용해 각 비트 위치에서의 값 알아내기
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1); //0 (0번째 비트값)
		System.out.println(flags >>> 1 & 1);//1 (1번째 비트값)
		System.out.println(flags >>> 2 & 1);//1 (2번째 비트값)
		System.out.println(flags >>> 3 & 1);//0 (3번째 비트값)
		System.out.println(flags >>> 4 & 1);//1 (4번째 비트값)
		System.out.println(flags >>> 5 & 1);//1 (5번째 비트값)
		System.out.println(flags >>> 6 & 1);//0 (6번째 비트값)
		System.out.println(flags >>> 7 & 1);//1 (7번째 비트값)
		
	}

}
