/*
	반복 함수와 재귀 함수.
	
		1. 팩토리얼을 반복 함수로 구현.
		
		2. 팩토리얼을 재귀 함수로 구현.
		
		3. 파보나치 수열을 반복 함수로 구현.
		
		4. 파보나치 수열을 재귀 함수로 구현.
	
*/
public class Main4 {
	
	public static int fibonacci (int number) {
		if(number == 1) {
			return 1;
		} else if(number ==2) {
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number -2);
		} // 왜 number -1 과 number -2 인가?
			/* 
			 	피보나치 수열은 1 1 2 3 5 8 13 ... 이런 식의 나열임
			 	
			 	즉, 나온 숫자 값의 한 칸 앞의 값(number - 1)과 두 칸 앞의 값(number -2)를 더한 값임.
			 
			*/
	}
	
	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");

	} /*
			재귀 함수의 경우 앞서 Main3에서 봤던 반복 함수에 비해 간결하다는 장점이 있다.
			
			하지만, 구해야 하는 값이 큰 경우에는 사용할 수 없다.
			
			예를 들면 위의 함수에서 50번째 원소 값을 구하라고 입력한다면,
			컴퓨터는 무한에 가까운 계산 작업을 수행해야만 하기 때문에 명령을 끝내 수행해 내지 못한다.
			
			즉, 사람은 조금 편해질지 모르나 그 부담은 컴퓨터가 다 지게 된다.
			
			적재적소가 중요.
	  */

}
