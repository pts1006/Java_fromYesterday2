
public class Person {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	// 변수를 만들었으면 이전 시간에 Node.java 맨 밑에 메모해 놓았던 기능ㅡ get변수와 set변수 한 번에 만드는 기능을 써 보자.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// "생성자"도 마찬가지. 우클릭 ~> Source ~> Generate Constructor using Fields.
	
	public Person(String name, int age, int height, int weight) {
		super();	// 부모 클래스의 생성자를 실행하겠다는 뜻.
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
