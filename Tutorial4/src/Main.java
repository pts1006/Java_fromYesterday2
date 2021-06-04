/*
 	연산자.
 		
 		1. 초를 입력 받아 몇 분 몇 초인지 계산하는 프로그램 작성.
 			final static int SECOND = 1000;
 			
 			int minute = SECOND / 60;
			int second = SECOND % 60;
		
			System.out.println(minute + "분" + second + "초");
 		
 		
 		2. ++와 --연산의 개념을 바르게 이해하고 프로그램을 작성.
 			int a = 10;
			System.out.println("현재의 a는" + a + "입니다.");
			a++;
			System.out.println("현재의 a는" + a + "입니다.");
			System.out.println("현재의 a는" + ++a + "입니다.");
			System.out.println("현재의 a는" + a++ + "입니다.");
			// ++a 와 a++의 차이
			// ++a는 괄호 안에서 a에 1을 더한 뒤 a를 출력.
			// a++는 값을 출력한 이후에 a에 1을 더해 줌. 즉, 다음에 나올 sysout값에 1이 더 해지게 됨. 밑에 처럼.
			System.out.println("현재의 a는" + a + "입니다.");
			// 이러면 단순 a인데도 결과로 13이 나오게 됨.
 		
 		3. %연산자의 사용법을 숙지하고 프로그램을 작성.
 			'나머지 값'을 결과로서 받음
 				ex) i = 10 % 3 // 1
 				
 		4. ==, >, <, &&, ||, ! 연산의 개념을 바르게 이해하고 프로그램 작성.
 			&& : and 연산자
 			|| : or 연산자
 			!  : 반대로. (참값은 거짓으로, 거짓은 참값으로)
 				ex)
 					int a = 50;
					int b = 50;
					
					System.out.println("a와 b가 같은가요? " + (a == b));
					System.out.println("a가 b보다 큰가요? " + (a > b));
					System.out.println("a가 b보다 작은가요? " + (a < b));
					System.out.println("a가 b와 같으면서 a가 30보다 큰가요? " + ((a == b) && (a > 30)));
					System.out.println("a가 50이 아닌가요? " + !(a == 50));
 		
 		5. '조건 ? 참 : 거짓' 연산의 형태를 숙지하고 프로그램을 작성.
 			위와 같은 식을 "삼항 연산자"라고 한다.
 				ex)
 				public static void main(String[] args) {
		
					int x = 50;
					int y = 60;
					
					System.out.println("최댓값은 " + max(x, y) + "입니다.");
				}
					// 함수 같은 경우 반환형, 함수 이름, 매개 변수로 구성 됨.
					static int max(int a, int b) {
						int result = (a > b) ? a : b; // a가 b보다 커? 그러면 a를 출력, 아니라면 b를 출력해.
						return result;
				}
					// 위의 식은 int a와 int b 중 더 큰 값을(max) 반환 받는 함수.
					// 출력값은 당연히 "최댓값은 60입니다."가 나옴. (a가 b보다 크지 않으니까 b 가 출력.)
 			
 		6. pow()를 이용한 거듭제곱 연산 프로그램을 작성.
 			사실 pow는 함수에 가까움.
 				ex)
 					밑에 있음.
*/
public class Main {

	
	
	public static void main(String[] args) {
		
		double a = Math.pow(3.0,  20.0);
		System.out.println("3의 20제곱은 " + a + "입니다.");
		
	}
	
	/*
	 	
	 	1. i++와 ++i는 단지 값을 증가시키려는 목적이라면 그 기능이 동일하다고 할 수 있다.
	 	
	 	2. 100 < x < 200은 잘못된 표현이다.
	 		(100 < x) && (x < 200)로 표현하는 것이 옳은 연산 식 표현이다.
	 	
	 	3. i++는 i += 1과 동일한 표현이다. 또한 i = i + 1과도 동일한 표현이다.
	 		위의 식들은 모두 <i의 값을 1만큼 증가 시킨다>는 의미를 가지고 있다.
	 	
	 */
	
}
