package practice;

public class Quiz_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "내 이름은 [홍길동]입니다. 나이는[15]살입니다.";
		String name;
		int age;
		
		int str1 = str.indexOf("[");
		int str2 = str.indexOf("]");
		name = str.substring(str1+1, str2);
		System.out.println(name);
		
		int str3 = str.lastIndexOf("[");
		int str4 = str.lastIndexOf("]");
		age = Integer.parseInt(str.substring(str3+1, str4));
		System.out.println(age);
	}

}
