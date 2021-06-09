/*
	사용자 정의 함수, 두 번째 시간.
		
		2. 문자열에서 마지막 단어를 반환하는 함수를 작성.

*/
public class Main2 {

	public static char function(String input) {
		return input.charAt(input.length() - 1);
	}
	
	// input.length()는 해당 문자열의 총 길이를 의미. 즉, 이번의 경우에는 Hello World => 11을 의미.
	// 위의 식에서 input.length()자리에는 11이라는 값이 반환된다. 그래서 11 - 1 이 됨.
	
	public static void main(String[] args) {
		
		System.out.println("Hello World의 마지막 단어는 " + function("Hello World"));

	} // 참고로 Hello World 에서 H는 0번째 단어.

}
