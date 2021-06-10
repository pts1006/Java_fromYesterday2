/*
	반복 함수와 재귀 함수.
	
		1. 팩토리얼을 반복 함수로 구현.
		
		2. 팩토리얼을 재귀 함수로 구현.
		
		3. 파보나치 수열을 반복 함수로 구현.
		
		4. 파보나치 수열을 재귀 함수로 구현.
	
*/
public class Main {
	
	// 참고 : factorial 이란?   5! = 5 * 4 * 3 * 2 * 1 = 120

	public static int factorial(int number) {
		int sum = 1;  // 초기화 작업임. 지정을 해 줘야 출발을 할 수 있으니까.
		
		for (int i = 2; i <= number; i++) {
			sum *= i ;  // sum에 계속, 늘어난 i를 곱해주는 거임
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼은 " + factorial(10));

	}

}
