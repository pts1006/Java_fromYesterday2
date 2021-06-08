import java.util.Scanner;

/*
  	
  	문제를 통해, 배운 것 정리하기.
  	
 */
public class Main {

	public static void main(String[] args) {
		
		// 자신의 이름을 출력하는 프로그램을 작성.
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		System.out.print("이름을 입력하시오 : ");
		name = sc.next();
		
		System.out.println("내 이름은 " + name + "입니다. \n");
		
		sc.close();
		
		// 프로그램 실행결과 보기.
		
		System.out.println(10 + 10);		// 20 
		System.out.println(30 * 30);		// 900
		System.out.println(20 - 5);			// 15
		System.out.println(40 + 3);			// 43
		System.out.println(395 % 18);		// 17
		
		System.out.println();
		
		// 사각형 모형 만들기.
		
		for (int i = 0; i < 10; i++) {
			System.out.println("**********");
		} 
		
		// 한 번 더
		System.out.println();
		
		for (int a= 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				System.out.print("★");
			}System.out.println();
		}
		
		System.out.println();
		
		// 구구단
		
		int z = 2, q = 0;
		
		while (q < 9) {
			q++;
			System.out.println(z + " * " + q + " = " + z*q);
		} 
	} 
}
