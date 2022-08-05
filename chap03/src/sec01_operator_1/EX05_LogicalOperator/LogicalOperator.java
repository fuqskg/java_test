package sec01_operator_1.EX05_LogicalOperator;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리연산자 and (&&) 둘 다 참이어야 참
		System.out.println(true && true); //t
		System.out.println(true && false); //f
		System.out.println(true && (5<3)); //f
		System.out.println((5<=5) && (7>2)); //t
		System.out.println();
		
		//or(||) 둘 중 하나만 참이어도 참
		System.out.println(true || true); //t
		System.out.println(true || false); //t
		System.out.println(false || (5<3)); //f
		System.out.println((5<=5) || (7>2)); //t
		System.out.println();
		
		//xor (^) 두개가 다르면 참
		System.out.println(true ^ true); //f
		System.out.println(true ^ false); //t
		System.out.println(false ^ (5<3)); //f
		System.out.println((5<=5) ^ (7>2)); //f
		System.out.println();
		
		//not (!) 반대
		System.out.println(!true); //f
		System.out.println(!false); //t
		System.out.println(false || !(5<3)); //t
		System.out.println((5<=5) || !(7>2)); //t
		System.out.println();
		
		//비트연산자로 논리연산 수행
		System.out.println(true & true); //t
		System.out.println((true & false)); //f
		System.out.println(true | (5<3)); //t
		System.out.println((5<=5) | (7>2)); // t
		System.out.println();
		
		//쇼트 서킷 사용여부 (논리연산자는 O 비트연산자는 x)
		int value1 = 3;
		System.out.println(false && ++value1 > 6); // f 서킷사용 o 
		System.out.println(value1); //3
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); //연산을 하지 않아도 f
		System.out.println(value2);//4
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
		
		
	
	
	
	}

}
