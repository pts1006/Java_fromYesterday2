/*
 	조건문과 반복문.
 	
 		1. if문을 이용하여 문자열이 특정 문자열을 포함하는지 확인하는 프로그램을 작성.
 			
 			String a = "I Love You";
			if(a.contains("Love")){
				// 포함하는 경우 실행되는 부분
				System.out.println("Me Too.");
			} else {
				//포함되지 않을 경우 실행되는 부분
				System.out.println("I Hate You.");
			}
 		
 		
 		2. 점수에 따라서 다른 메시지를 출력하는 프로그램을 작성.
 		
 			int score = 95; 
		
			if(score >= 90) {
				System.out.println("A+입니다.");
			} else if (score >= 80){
				System.out.println("B+입니다.");
			} else if (score >= 70){
				System.out.println("C+입니다.");
			} else {
				System.out.println("F입니다.");
			}

 		
 		3. 문자열과 정수형을 각각 조건문을 이용해 활용해 보고 그 차이점을 공부.
 		
 			String a = "Man";
			int b = 0;
			
			// 자바는 String을 비교할 때 equal()을 이용한다.
			// 그 이유는 String은 다른 자료형과는 다른, 문자열 자료형이기 때문.
			
			if(a.equals("Man")) {
				System.out.println("남자입니다.");
			} else {
				System.out.println("남자가 아닙니다.");
			}
	
			
			if(b == 3) {
				System.out.println("b는 3입니다.");
			} else {
				System.out.println("b는 3이 아닙니다.");
			}
			
			
			if(a.equalsIgnoreCase("man") && b == 0) {
				System.out.println("참입니다.");
			} else {
				System.out.println("거짓입니다.");
			}
 		
 		4. while을 이용해 1부터 1000까지의 합을 출력하는 프로그램을 작성.
 		
 			int i = 1, sum = 0;
			while(i <= 1000) {
				sum += i++;
			}
			System.out.println("1부터 1000까지의 합은 " + sum + "입니다");
 		
 		5. for 문을 이용하여 삼각형을 출력하는 프로그램을 작성.
 			
 			for문 : 초기화 부분, 조건 부분, 연산 부분으로 구성
 			이중 for문을 이용해 삼각형을 출력할 거임. ( 모든 결과값을 눈으로 봤을 떄 삼각형으로 보이기만 하면 됨)
 			
 			
	 			final static int N = 30;
	
				public static void main(String[] args) {
					
					for(int i = N; i > 0; i--) {
						for(int j = i; j > 0; j--) {
							System.out.print("□");
						}
						System.out.println();
					}
					
				}
			
		6. for문을 이용해 원을 출력하는 프로그램을 작성.
			
			밑에 있음.
		
 	
 */
public class Main {
	
	final static int N = 15;

	public static void main(String[] args) {
		
		
		// x^2 + y^2 = r^2  ~> 원점을 중심으로 하는 원의 방정식
		
		for(int i = -N; i <= N; i++) {
			for(int j = -N; j <= N; j++) {
				if(i * i + j * j <= N * N) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		/*
		  	
		  	1. 하나의 비교 연산자는 true 혹은 false를 반환하게 된다.
		  	
		  	2. 모든 조건문, 반복문에서는 웬만해선 무조건 괄호를 적용해라.
		  	
		  	3. for문 혹은 while문은 얼마든지 중첩될 수 있다.
		  	
		  	4. for(;;)는 while(true)와 똑같이 무한 루프라는 의미로 동작한다.
		  	
		  	5. break;를 이용해 반복문을 즉시 빠져나올 수 있다.
		  	
		 */
		
	}

}
