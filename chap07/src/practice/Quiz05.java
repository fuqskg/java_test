package practice;
class A1{
	void averageScore(int...k){
		int sum = 0;
		for(int i=0; i<k.length; i++) {
			sum += i;
		}
		double avg =(double)sum / k.length;
		System.out.println("평균값: " + avg);
	}
}
public class Quiz05 {
	
	public static void main(String[] args) {
		A1 a = new A1();
		
		a.averageScore(1);
		a.averageScore(1,2);
		a.averageScore(1,2,3);
		a.averageScore(1,2,3,4);
		a.averageScore(1,2,3,4,5);

	}

}
