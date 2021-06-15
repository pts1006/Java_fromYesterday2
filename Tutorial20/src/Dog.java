// 초기의 public class Dog 를 public interface dog로 변경.
public interface Dog {

/*	abstract void crying();
	public void show() {
		System.out.println("Hello World!");
	}
*/ // 이럴 경우 오류가 발생함.
	// 왜 와이? 위에서 인터페이스 선언을 했으니 설계만 해야 하는데 sysout이라는 실행 코드를 써 버렸으니까.
	// but, 추상 선언 상태 (= abstract class dog)에서는 괜찮음.
	
	// 즉 인터페이스라 선언한 시점에서, "어떤 함수가 존재한다" 라는 것만 적어 넣어야 한다.
	
	abstract void crying();
	public void showTwo();
	
}
