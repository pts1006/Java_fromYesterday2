// 2. �������̽��� ���� ��ӿ� ���� �н�.

// 		���� ���� ����� �н��ϴ� �뵵�� ������, ������ �ǰ� ���� �ʴ´�.

public class Main2 implements Dog, Cat {

	// �̷� ������, �߻��̶�� ���� ����� �ȵ����� �������̽��� �޸��� ��� �����ϱ⸸ �ϸ� �ȴ�.
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
/*		main.showOne();	*/  // Main ��ü�� ���̶� ������ �߻��ϳ� ��. ���� ������ �� ���� ����.
		main.showTwo();
		
	// �Ʒ��� ����, �� �������̽��� ������ �޶� ���� ���� �� ��� ���� �� �� �ִ�. (showOne, showTwo)
		
	}


	@Override
	public void crying() {
		
		System.out.println("��! ��!");
		
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
