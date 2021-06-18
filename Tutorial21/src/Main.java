import java.util.Scanner;

/*
	다형성 (Polymorphism)
		"다양한 형태의 성질을 가진다"라는 의미.
			
		자바는 기본적으로 다형성을 그 특징으로 갖는 객체 지향 프로그래밍 언어이다.
		자바에서는 이를 이용해 객체를 사용할 때, 사용하는 변수 형태를 바꾸어 여러 타입의 객체를 참조할 수 있다.
		다형성은 부모 클래스 타입의 참조 변수로, 하위 클래스의 객체를 참조할 수 있게 해 준다.
	
	1. 다형성을 적절하게 사용하여 다양한 프로그램을 개발.
		~> 과일 정보 프로젝트를 구현.
	
 */
public class Main {

	public static void main(String[] args) {
		
/*		
		
		// 부모 클래스의 변수로서, 자신의 자식 클래스의 인스턴스를 넣어 줄 수 있다.
		// 다시, Peach 라는 자기 자식 클래스의 인스턴스를 fruit이라는 자신의 안에 넣어 줄 수 있다.
		Fruit fruit = new Peach();
		fruit.show();

	}
	
*/
	
/* 위 코딩의 결과로
		
		이름 : 복숭아
		가격 : 1500
		신선도 : 75
		
	라는 결과값을 얻을 수 있다.
	
	Peach 라는 클래스에서는
	
		price = 1500;
		name = "복숭아";
		fresh = 75;
		
	라고 적었지만, Fruit이 이 Peach를 상속 받으면서 자기 자신의
	
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("신선도 : " + fresh);
		
	이 순서대로 출력하게 된 결과인 것.

*/
		// 심화. 바나나를 만들고, 사용자로부터 값을 받게.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("바나나면 1을, 복숭아면 2를 입력하시오.");
		int input = scanner.nextInt();
		
		Fruit fruit;
		
		if(input ==1) {
			fruit = new Banana();
			fruit.show();
		} else if(input ==2) {
			fruit = new Peach();
			fruit.show();
		}
		
		scanner.close();
		
	}
}
