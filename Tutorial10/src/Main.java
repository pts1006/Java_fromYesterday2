/*
	사용자 정의 함수, 두 번째 시간.
	
		1. 약수 중 K번째로 작은 수를 찾는 프로그램을 작성.
		
			밑에 것.
		
		
		2. 문자열에서 마지막 단어를 반환하는 함수를 작성.
		
		 	Main2.java 파일에 있음.
		 
		3. max()를 이용하여 최댓값을 저장하는 프로그램을 작성.
		
			Main3.java 파일에 있음.
*/
public class Main {

	public static int function(int number, int k) {
		for (int i = 1; i <= number; i ++) {
			if(number % i == 0) {
				k--;
				if (k == 0 ) {
					return i;
				}
			}
		} return - 1;
	}
	
	public static void main(String[] args) {
		
		int result = function(3050, 10);
		
		if (result == -1) {
			System.out.println("3050의 10번째 약수는 없습니다.");
		} else {
			System.out.println("3050의 10번째 약수는 " + result + "입니다.");
		}

	}

}
