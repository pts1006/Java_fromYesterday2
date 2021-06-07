import java.io.File;
import java.io.FileNotFoundException;

// File도 Scanner와 마찬가지임. import 시켜 줘야 함.

import java.util.Scanner;

// Scanner 클래스를 이용하려면 이처럼 작성해야 함. (Scanner를 입력하면 밑에 빨간 줄이 나옴. 찾아서 클릭해주면 됨. 혹은 컨트롤 + 쉬프트 + o)

/*
	기본 입출력.
	
		앞서 배운 내용들에 scanner 클래스를 접목해 다양한 프로그램을 작성.
		
			1. 특정한 정수를 입력 받아서 그대로 출력하는 프로그램을 작성.
				
				public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);  // sc는 인스턴스, 변수
				System.out.print("정수를 입력하세요 : ");
				int i = sc.nextInt();
				System.out.println("입력한 정수는 " + i + "입니다.");
				sc.close();
			}
			
			
			2. 파일에 차례로 입력된 모든 정수에 100을 곱해 출력하는 프로그램을 작성.
				이런 경우를 <파일 입출력>이라 말한다.
				
				File file = new File("input.txt");  // input.txt 라는 파일을 불러와서 file변수가 그것을 처리할 수 있도록 해 준다는 의미.
				try {
					Scanner sc = new Scanner(file);
					while(sc.hasNextInt()) {
						System.out.println(sc.nextInt() * 100);
					}
					sc.close();
				} catch (FileNotFoundException e) {
					System.out.println("파일을 읽어 오는 도중에 오류가 발생했습니다.");
				}
			
			3. 1단부터 9단까지 구구단을 출력하는 프로그램을 작성.
				동영상에 안 나오네. 혼자 해 볼 것.
*/
public class Main {

	public static void main(String[] args) {
		
		File file = new File("input.txt");  // input.txt 라는 파일을 불러와서 file변수가 그것을 처리할 수 있도록 해 준다는 의미.
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어 오는 도중에 오류가 발생했습니다.");
		}
	}
	
	/*
	 	1. 자바에서는 Scanner 클래스만 잘 활용해도 다양한 입출력 형태를 자유자재로 구사할 수 있다.
	 	
	 	2. 주석은 일단 최대한 많이 작성하는 습관을 들이자.
	 		주석은 컴파일 단계에서 제거되기에 프로그램의 크기와는 상관이 없다.
	 	
	 	3. Scanner로 문자열을 입력 받고 싶을 때에는 next()함수와 nextline()을 적절히 사용.
	 	
	 */
	
}
