package sec02_method.EX05_EffectOfReferenceDataArgument;
//참조자료형 매개변수값의 변화 (외부에서 호출)
import java.util.Arrays;
class A{
	 void modifyData(int[] a) {
		 a[0]=4;
		 a[1]=5;
		 a[2]=6;
	 }
	 
	 void printArray(int[] a) {
		 System.out.println(Arrays.toString(a));
	 }
}

public class EffectOfReferenceDataArgument_External {

	public static void main(String[] args) {
		A a = new A();
		int [] array = new int[] {1,2,3};
		
		a.modifyData(array);		
		a.printArray(array); //[4,5,6]
	}
	
}
