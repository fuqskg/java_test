package sec01_operator_1.EX02_BitwiseOperator;

public class BitwiseOperator {

	public static void main(String[] args) {
		//자바 메서드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data)); //1101 (2진수로)
		System.out.println(Integer.toOctalString(data));//15(8진수로)
		System.out.println(Integer.toHexString(data));//0d (16진수로)
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));//13 (2진수를 10진수로)
		System.out.println(Integer.parseInt("15", 8)); //13 (8진수를 10진수로)
		System.out.println(Integer.parseInt("0D",16)); //13 (16진수를 10진수로)
		System.out.println();
		
		//다양한 진법 표현
		System.out.println(13); //13
		System.out.println(0b1101); //13
		System.out.println(015); //13
		System.out.println(0x0D); //13
		System.out.println();
		
		//비트연산자
		//and비트연산자
		
		System.out.println(3 & 10); //2
		System.out.println(0b0011 & 0b1010); //2
		System.out.println(0x03 & 0x0A); //2
		System.out.println();
		
		//or비트연산자
		System.out.println(3 | 10); //11
		System.out.println(0b0011 | 0b1010); //11
		System.out.println(0x03 |0x0A); //11
		System.out.println(); //11
		
		//xor비트연산자
		System.out.println(3 ^ 10);//9
		System.out.println(0b0011 ^ 0b1010);//9
		System.out.println(0x03 ^ 0x0A);//9
		System.out.println();
		
		//not 비트연산자
		System.out.println(~3); //-4
		System.out.println(~0b0011); //-4 
		System.out.println(~0x03); //-4
		
	}

}
