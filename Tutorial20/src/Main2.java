// 2. 인터페이스의 다중 상속에 대해 학습.

// 		단지 다중 상속을 학습하는 용도일 뿐으로, 실행은 옳게 되지 않는다.

public class Main2 implements Dog, Cat {

	// 이런 식으로, 추상이라면 다중 상속이 안되지만 인터페이스는 콤마만 찍고 나열하기만 하면 된다.
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
/*		main.showOne();	*/  // Main 객체가 둘이라서 문제가 발생하나 봄. 굳이 실행은 해 보지 말자.
		main.showTwo();
		
	// 아래를 보면, 각 인터페이스의 내용이 달라도 빠짐 없이 다 들고 옴을 알 수 있다. (showOne, showTwo)
		
	}


	@Override
	public void crying() {
		
		System.out.println("왈! 왈!");
		
	}

	@Override
	public void showOne() {
		
		System.out.println("One!");
		
	}
	
	@Override
	public void showTwo() {
		
		System.out.println("Two!");
		
	}

}
