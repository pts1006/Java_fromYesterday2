/*
	����� ���� �Լ�, �� ��° �ð�.
		
		2. ���ڿ����� ������ �ܾ ��ȯ�ϴ� �Լ��� �ۼ�.

*/
public class Main2 {

	public static char function(String input) {
		return input.charAt(input.length() - 1);
	}
	
	// input.length()�� �ش� ���ڿ��� �� ���̸� �ǹ�. ��, �̹��� ��쿡�� Hello World => 11�� �ǹ�.
	// ���� �Ŀ��� input.length()�ڸ����� 11�̶�� ���� ��ȯ�ȴ�. �׷��� 11 - 1 �� ��.
	
	public static void main(String[] args) {
		
		System.out.println("Hello World�� ������ �ܾ�� " + function("Hello World"));

	} // ����� Hello World ���� H�� 0��° �ܾ�.

}
