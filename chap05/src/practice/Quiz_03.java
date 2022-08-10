package practice;

import java.util.Arrays;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {1.2, 3.4, 5.6};
		double[] b = a;
		b[0] = 7.8;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
//배열은 동일하게 값이 변경됨.
	}

}
