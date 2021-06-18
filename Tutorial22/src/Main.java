/*
	객체 (Object)
		객체 클래스는 모든 객체의 조상으로서 사용된다.
		자바에서는 사실 모든 클래스가 암시적으로 Object 클래스를 상속 받고 있다. 즉, Object는 모든 클래스의 조상.
		이러한 클래스가 존재하는 이유는 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공하기 위함이다.

	1. 객체를 비교하는 방법.
		모든 클래스의 조상은 오브젝트라는 클래스다.
		굳이 extends Object를 쓰지 않더라도 암묵적으로 상속 받고 있음을 알기만 하고 넘어가면 되는 시간.
*/
public class Main {

	public static void main(String[] args) {
		
		// 두 인스턴스를 비교해 보자.
		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		
		System.out.println(archer1 == archer2);	// 두 인스턴스를 그대로 비교할 시 이름부터 다르니 false가 나옴.
		System.out.println(archer1.equals(archer2));	// 가지고 있는 내부적 값이 같으냐? Archer.java에서 입력하고 넘어 왔으니 활용 가능.
		
	}

}
