// 부모 클래스로 어떤 틀을 잡아 놓고, 그걸 상속 받아 사용하는 갖가지 자식 클래스들을 자기 자신의 변수로서 불러와 활용.
public class Fruit {

	String name;
	int price;
	int fresh;
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("신선도 : " + fresh);
	}
	
}
