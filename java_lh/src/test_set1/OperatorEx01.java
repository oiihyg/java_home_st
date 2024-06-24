package test_set1;

import java.util.Scanner;

public class OperatorEx01 {

	// 학생 3명의 성적을 입력받아 총점과 평균을 구하는 기능
	
	// 스캐너 기능 추가
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 변수 선언 num 입력받을 변수
		int num = 0;
		// sum 입력 받은 값을 더하는 변수
		int sum = 0;
		// 평균값 구하는 변수
		double avg = 0;
		
		// 학생 3명의 성적을 입력
		for(int i=0;i<3;i++) {
			// 몇번째 학생인지 출력
			System.out.println("학생"+(i+1)+"의 성적 : ");
			// scan을 통한 변수값 입력
			num = scan.nextInt();
			// 변수 값을 sum에 더하면서 저장
			sum += num;
		}
		// sum을 평균 값을 구하는 기능 소수점 자리까지 나오기 위해 double 사용
		avg = sum / (double)3;
		// 출력
		System.out.println(avg);
		
		
		
	}

}
