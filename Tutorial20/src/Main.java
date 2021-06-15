/*
	인터페이스
		얼핏 보기에는 추상 클래스와 매우 흡사한 개념. 설계 기능 중 하나이며, 다중 상속을 구현하게 해 주는 기술.
			추상 클래스 = 추상 메소드 외에 멤버 변수나 일반 메소드를 가질 수 있다.
			but 인터페이스 = 반드시 사전에 정의된 추상 메소드와 상수만을 가질 수 있다. 반드시 설계에 필요한 것만.
		대개 팀 프로젝트의 동시 작업에 유리. 추상보다 요구되는 설계 기준이 높아 더 체계적이라는 평.
		
	1. 인터페이스를 선언하고 메소드를 다룬다.
	
	2. 인터페이스의 다중 상속에 대해 학습.

 */
public class Main implements Dog {

	// 인터페이스는 추상과 달리 상속할 때 extends가 아닌, implements를 사용.
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main. showTwo();

	}

	@Override
	public void crying() {
		
		System.out.println("왈! 왈!");
		
	}

	@Override
	public void showTwo() {
		
		System.out.println("Hello World!");
		
	}

}
