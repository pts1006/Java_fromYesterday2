
public class Warrior extends Hero {

	public Warrior(String name) {	// name �̶�� �� �Է� �޾Ƽ� Hero�� ������ name �̶�� �⺻ ���� ������ �ʱ�ȭ �� �� �ֵ��� �ϴ� ��.
		super(name);	// super = �ڽ��� �θ� Ŭ������ �����ڸ� �ǹ�. ��, �� �ڵ�� �ڽ��� �θ� Ŭ������ ������ �ִ� �⺻�� ������ �ʱ�ȭ �ϴ� �뵵.
	}
	
	public void groundCutting() {
		System.out.println("���� ������!");
	}
	
}
