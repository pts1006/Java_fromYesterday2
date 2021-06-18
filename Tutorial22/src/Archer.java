// public class Archer 라고만 적혀 있어도 그 뒤에는 extends Object가 생략돼 있는 것임.
public class Archer {

	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	
	// 매개 변수로 들어온 obj라는 변수가 Archer라는 인스턴스와 같은지 보는 코드.
	public boolean equals(Object obj) {
		Archer temp = (Archer) obj;
		// temp는 임시 변수 명일 뿐, 특별한 의미는 없다. 또한 "(Archer) obj"는 지금 들어온 obj를 Archer 형태로 바꾸겠다는 것.
			
			/* 여기서 잠깐.
			 obj라는 변수를 Archer 형태로 바꿀 수 있는 이유는 obj가 Archer 클래스의 부모 클래스이기 때문. (다형성)
			*/
		
		// 우리가 가지고 있는 name과 power라는 변수가, temp가 가지는 name과 power라는 변수와 같은지 물어보자.
		if(name == temp.name && power == temp.power) {
			return true;		// 같으면 트루 뱉어라.
		}
		else
		{
			return false;		// 다르면 폴스 뱉어라.
		}
	} // 자기 자신의 인스턴스와, 매개 변수로 들어온 오브젝트를 비교해서 참 거짓을 간단히 알아 보는 방법.
}
