/*
 	변수에 대한 수업.
 		
 		int, double, string에 대한 건 "생활코딩"과 같음.
 	
 		추가되는 부분) final, 오버플로우
  				
  				1. final은 상수를 정의하는 명령어. 한번 선언되면 절대 바뀌지 않으므로 메인함수의 바깥 쪽에 정의.
  				
  				2. 오버플로우는 상수 자리에 특정 값을 입력한 후 메인함수에 (상수 + 작은 값); 했을 때
  					가장 작은 값이 나온다는 걸 설명하는 내용.
		  				
		  				ex) final static int int_MAX = 2147843647로 정의.
		  					메인 함수에서
		  					
		  					int a = int_MAX;
		  					System.out.println(a + 1);
		  					
		  					라고 하면
		  					인트 값의 최대치는 2147843647인 상황에서 +1을 했을 때 그보다 큰 값이 없으므로
		  					-2147843647이 출력되게 됨. (오류의 일종)
*/
public class Main {

//  final이 들어가는 곳	
	
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		System.out.println("a + b = " + (a + b) );
		System.out.println("a - b = " + (a - b) );
		System.out.println("a * b = " + (a * b) );
		System.out.println("a / b = " + (a / b) );
		
	}
/*
	* 관련 상식.
 	- 자바에서는 변수를 설정한 다음에 초기화를 하지 않으면 사용할 수 없다.
 	- 정수를 나타내는 타입만 해도 short, int, long 등으로 다양함.
 	
 	)) 여기서부터는 "생활코딩"에서 배움. 형변환(casting)이라는 거임. 22.8.3 수업내용
 	- 정수 변수 안에 실수를 넣으면 정수 부분만 변수에 저장된다.
 	- 실수 값을 반올림할 때는 변수에 0.5를 더한 뒤에 정수형으로 형변환을 하면 된다.
 	  반올림한 값 = (int) (실수 + 0.5);
*/
	
	
}