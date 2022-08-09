package sec01_array.EX10_ArgumentOfMainMethod;

import java.util.Arrays;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		// 입력매개변수로 abc 13 123 a 전달했을 때
		// 입력매개변수로 전달된 string[]타입의 참조변수 args값을 읽는예제
		
		
		// args배열의 길이 구하기
		System.out.println("args개수(길이): "+args.length);
		System.out.println();
		
		//입력매개변수 출력 1
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//입력매개변수 출력 2
		for(String s:args) {
			System.out.println(s);
		}
		System.out.println();
	//합계구하는
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum = sum +(Integer.parseInt(args[i]));
			System.out.print(args[i]+ " " );
		}
		System.out.println();
		System.out.println("합: "+ sum);
		System.out.println();
		
		
		//배열로 출력
		int sum1=0;
		int[] a = new int[args.length]; //1차원 배열(args개수만큼)
		for(int i=0; i<args.length; i++) {  //a.args라고 해도 상관없음
			a[i]= Integer.parseInt(args[i]); 
			sum1 = sum1 + a[i];
			System.out.print("[" + i + "번방]: " + a[i]+ " ");
		}
		System.out.println();
		System.out.println("합계: " + sum1);
		System.out.println("배열: "+Arrays.toString(args));
		System.out.println();
		
	}
}
