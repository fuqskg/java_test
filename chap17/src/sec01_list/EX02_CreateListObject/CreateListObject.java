package sec01_list.EX02_CreateListObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		// 1. List 구현클래스의 생성자를 사용해 객체생성
		List<Integer> aList1 = new ArrayList<>();
		List<Integer> aList2 = new ArrayList<>(30);
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(30);
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30);
		
		
		// 2. Arrays 클래스의 정적메서드 활용
		List<Integer> aList7 = Arrays.asList(1,2,3,4);
		List<String> aList8 = Arrays.asList("안녕", "ㅎㅇㅎㅇ");
		aList7.set(1,7);
		aList8.set(0, "감사");
//		aList7.add(5); // 불가능
//		aList8.remove(0); // 불가능
		System.out.println(aList7);
		System.out.println(aList8);
		
	}

}
