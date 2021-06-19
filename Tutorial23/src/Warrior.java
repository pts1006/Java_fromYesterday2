
public class Warrior extends Hero {

	public Warrior(String name) {	// name 이라는 걸 입력 받아서 Hero가 가지는 name 이라는 기본 내부 변수를 초기화 할 수 있도록 하는 것.
		super(name);	// super = 자신의 부모 클래스의 생성자를 의미. 즉, 이 코드는 자신의 부모 클래스가 가지고 있던 기본적 변수를 초기화 하는 용도.
	}
	
	public void groundCutting() {
		System.out.println("대지 가르기!");
	}
	
}
