/*
	반복 함수와 재귀 함수.
	
		1. 팩토리얼을 반복 함수로 구현.
		
		2. 팩토리얼을 재귀 함수로 구현.
		
		3. 파보나치 수열을 반복 함수로 구현.
			피보나치 ? ~> 두 개의 수를 합쳐서 한 개의 수를 만드는 과정.
				ex) 1 1 ~> 2
					1 2 ~> 3
					2 3 ~> 5
					3 5 ~> 8
					
			이 시간에 하는 건 특정 x 값을 넣었을 때 몇 번째에 해당하는 값이 어떤 건지 맞추는 것.
			즉, 몇 번째 수를 가리켰을 때 피보나치 수열 중에서 어떤 수인지 맞추는 함수.
		
		4. 파보나치 수열을 재귀 함수로 구현.
	
*/
public class Main3 {
	
	public static int fibonacci(int number) {
		
		int one = 1;
		int two = 1;		// 두 개의 값을 만들 필요가 있음. (피보나치니까.)
		int result = -1;	// 오류일 때 나오는 값 정의.
		
		if (number == 1) {
			return one;
		} else if (number == 2) {
			return two;
		} else {
			for (int i = 2; i < number; i++) {
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");

	}

}
