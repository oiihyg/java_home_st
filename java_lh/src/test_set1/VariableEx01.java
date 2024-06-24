package test_set1;

public class VariableEx01 {

	public static void main(String[] args) {
		
		int age;
		//int age = 21;
		//int brotherAge = age;
		int redColor = 0xff; // 16진수 ff를 저장 => 10진수 256
		int num = 0b11; // 2진수 11을 저장 => 10진수 3
		int num2 = 011; // 8진수 11을 저장 => 9
		int num3 = (int) 1e3; // 1*10^3 == 1000 제곱근
		long num4 = 123456789123L; // L을 생략하면 에러 발생
		
		System.out.println(num3);
	}

}
