/*
	반복 함수와 재귀 함수.
	
		1. 팩토리얼을 반복 함수로 구현.
		
		2. 팩토리얼을 재귀 함수로 구현.
		
		3. 파보나치 수열을 반복 함수로 구현.
		
		4. 파보나치 수열을 재귀 함수로 구현.
	
*/
public class Main2 {
	
	// 참고 : factorial 이란?   5! = 5 * 4 * 3 * 2 * 1 = 120

	public static int factorial(int number) {
		
		if(number ==1)
			return 1;
		else
			return number * factorial(number - 1);
	} // 왜 number - 1이냐?  ~>  5! = 5 * 4! 이기 때문임. 숫자 4는 (5-1)가 되어서 나온 것임.
	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼은 " + factorial(10));

	}

}
