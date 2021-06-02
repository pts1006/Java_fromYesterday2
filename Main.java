/*
  	자료형에 대해 배우는 시간.
  	
  		1. 아스키코드 기반의 char형을 사용해 a부터 z까지 출력하는 프로그램 작성하는 법.
	  			for (char i = 'a'; i <= 'z'; i++)
			{
				System.out.print(i + " ");
			}
		
		2. 10진수를 8진수 혹은 16진수로 바꾸어 출력하기.
		
			int a = 200;
			
			System.out.println("10진수 : " + a);
			System.out.format("8진수 : %o\n" , a);
			// %o : 형식 지정자. 8진수.
			// a 라는 값이 %o의 위치에 들어가게 되는데 %o가 의미하는 것은 어떠한 10진수 값을 8진수 값으로 출력해라!
			System.out.format("16진수 : %x" , a);
			// %x : 형식 지정자. 16진수.
			// println이 아닌 format을 사용했기 때문에 여기까지 사용하려면 위쪽 8진수 문자열에 \n(엔터해라!)를 넣음
  	
  		3. String의 substring 함수를 활용해 보자.
  			
  			밑에 있음.
 */



public class Main {

	public static void main(String[] args) {
	
		String name = "John Doe";
		System.out.println(name);
		System.out.println(name.substring(0,1));
		// 여기서 0은 첫번째 문자를 의미. 뒷자리(1)에 오는 것은 마지막 자리가 몇번째 문자인지 알려주는 것.
		// 0부터 증가해서 1까지 증가.
		System.out.println(name.substring(3,6));
		System.out.println(name.substring(5,8));
		// 5부터 시작해서 8까지 증가. ~> 5는 여섯번째 문자인 D를 의미하고 거기서부터 8까지 증가니 Doe가 출력.
		System.out.println(name.substring(0,8));
		
	}
/*
 	
 	- 기본적으로 정수를 나타내는 자료형이 많은 이유는 각 자료형이 차지하는 메모리 공간의 크기가 다르기 때문.
 	- double형이라고 하더라도 과도하게 큰 수를 저장하고자 하면 잘못된 계산 결과가 나올 수 있다.
 	- 소수점 표기 형식을 지수 형식으로 출력하고 싶으면 %e를 이용하면 된다.
 	- 자바에서 String은 내부적으로 char의 배열로 되어 있다. String의 최대 크기는?
 		: 4기가 바이트 (억 단위 글자 수)
 	- 자바의 String은 클래스 기반의 비원시적 자료형이다.
 	
 */
}
