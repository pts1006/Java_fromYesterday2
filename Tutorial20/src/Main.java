/*
	�������̽�
		���� ���⿡�� �߻� Ŭ������ �ſ� ����� ����. ���� ��� �� �ϳ��̸�, ���� ����� �����ϰ� �� �ִ� ���.
			�߻� Ŭ���� = �߻� �޼ҵ� �ܿ� ��� ������ �Ϲ� �޼ҵ带 ���� �� �ִ�.
			but �������̽� = �ݵ�� ������ ���ǵ� �߻� �޼ҵ�� ������� ���� �� �ִ�. �ݵ�� ���迡 �ʿ��� �͸�.
		�밳 �� ������Ʈ�� ���� �۾��� ����. �߻󺸴� �䱸�Ǵ� ���� ������ ���� �� ü�����̶�� ��.
		
	1. �������̽��� �����ϰ� �޼ҵ带 �ٷ��.
	
	2. �������̽��� ���� ��ӿ� ���� �н�.

 */
public class Main implements Dog {

	// �������̽��� �߻�� �޸� ����� �� extends�� �ƴ�, implements�� ���.
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main. showTwo();

	}

	@Override
	public void crying() {
		
		System.out.println("��! ��!");
		
	}

	@Override
	public void showTwo() {
		
		System.out.println("Hello World!");
		
	}

}
