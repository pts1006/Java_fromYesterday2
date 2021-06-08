/*
	사용자 정의 함수 간단 소개
	
		1. 3개의 수 최대 공약수를 찾는 프로그램을 작성.
*/
public class Main {

	// 사용자가 쉽게 만들 수 있다는 점에서 <사용자 정의 함수>라고 말한다. 자바에서는 함수와 메소드는 유사한 개념.
	// 함수는 	  반환형, 함수명, 매개변수로 이루어진다.
	//				|	|		|
	public static int function(int a, int b, int c) {
		int min;
		if (a > b) {
			if (b > c) {
				min = c;
			} else {
				min = b;
			}
		} else {
			if (a > c) {
				min = c;
			} else {
				min = a;
			}
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	// 해당 함수는 최솟값을 찾는 알고리즘이 작성된 것.
	
	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)의 최대 공약수 : " + function(400, 300, 750));

	}

}
