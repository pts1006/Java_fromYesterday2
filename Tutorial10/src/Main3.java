/*
	사용자 정의 함수, 두 번째 시간.
	
		3. max()를 이용하여 최댓값을 저장하는 프로그램을 작성.
		
			Main3.java 파일에 있음.
*/
public class Main3 {

	public static int max (int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int function (int a, int b, int c) {
		int result = max(a, b);   // a와 b 중에서 더 큰 값을 result에 넣는다.
		result = max(result, c);  // 위에서 뽑은 큰 값 중 하나를 c와 비교해서 그 중에서 또 더 큰 값을 결과로 받는다.
		return result; 			  // 결과적으로 a, b, c 중에서 가장 큰 값이 결과로서 리턴 된다.
	}
	
	public static void main(String[] args) {
		
		System.out.println("(354, 567, 789) 중에서 가장 큰 값은 " + function(354, 567, 789));

	}

}
