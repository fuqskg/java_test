package practice;
import java.util.Scanner;
public class elec_cal {
	//요금테이블: http://www.dongjineng.co.kr/main/elec_calcu.html 참고
	public static void main(String[] args) {
		// 전기요금 계산기
		
		Scanner a = new Scanner(System.in);
		
		int use_elec = a.nextInt(); //전기사용량
		int b_fee; //기본요금
		double e_energy; //전력량요금
		double total_fee; //전체요금
		
		if(use_elec <= 50) {
			b_fee = 390;
			e_energy = use_elec * 34.5;
			total_fee =b_fee + e_energy;
			System.out.println("사용량: \n" + use_elec);
			System.out.println(("전력량요금: \n" + e_energy));
			System.out.println("전기요금 합계: "+total_fee + "원");
		}
		
		else if(use_elec <= 100) {
			b_fee = 390;
			e_energy = (use_elec-50) * 81.7 + 50 * 34.5;
			total_fee =b_fee + e_energy;
			System.out.println("사용량: \n" + use_elec);
			System.out.println(("전력량요금: \n" + e_energy));
			System.out.println("전기요금 합계"+total_fee + "원");
		}
		
		else if(use_elec <= 200) {
			b_fee = 850;
			e_energy = (use_elec-100) * 122.9 + 50 * 87.7 + 50 * 34.5;
			total_fee =b_fee + e_energy;
			System.out.println("사용량: \n" + use_elec);
			System.out.println(("전력량요금: \n" + e_energy));
			System.out.println("전기요금 합계"+total_fee + "원");
		}
		
		else if(use_elec <= 300) {
			b_fee = 1500;
			e_energy = (use_elec-200) * 177.7 + 100 * 122.9 + 50 * 81.7 + 50 * 34.5;
			total_fee =b_fee + e_energy;
			System.out.println("사용량: \n" + use_elec);
			System.out.println(("전력량요금: \n" + e_energy));
			System.out.println("전기요금 합계"+total_fee + "원");
		}
		
		else if(use_elec <= 400) {
			b_fee = 3590;
			e_energy = (use_elec-300) * 308.0 + 100 * + 177.7 + 100 * 122.9 + 50 * 81.7 + 50 * 34.5;
			total_fee =b_fee + e_energy;
			System.out.println("사용량: \n" + use_elec);
			System.out.println(("전력량요금: \n" + e_energy));
			System.out.println("전기요금 합계"+total_fee + "원");
		}
		
		else if(use_elec <= 500) {
			b_fee = 6750;
			e_energy = (use_elec-400) * 405.7 + 100 * 308 + 100 * 177.7 + 100 * 122.9 + 50 * 81.7 + 50 * 34.5;;
			total_fee =b_fee + e_energy;
			System.out.println("사용량: \n" + use_elec);
			System.out.println(("전력량요금: \n" + e_energy));
			System.out.println("전기요금 합계"+total_fee + "원");
		}

	}

}
