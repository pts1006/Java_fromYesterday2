/*
	����� ���� �Լ� ���� �Ұ�
	
		1. 3���� �� �ִ� ������� ã�� ���α׷��� �ۼ�.
*/
public class Main {

	// ����ڰ� ���� ���� �� �ִٴ� ������ <����� ���� �Լ�>��� ���Ѵ�. �ڹٿ����� �Լ��� �޼ҵ�� ������ ����.
	// �Լ��� 	  ��ȯ��, �Լ���, �Ű������� �̷������.
	//				|	|		|
	public static int function(int a, int b, int c) {
		int min;
		if (a > b) {
			if (b > c) {
				min = c;
			} else {
				min = b;
			}
		} else {
			if (a > c) {
				min = c;
			} else {
				min = a;
			}
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	// �ش� �Լ��� �ּڰ��� ã�� �˰����� �ۼ��� ��.
	
	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)�� �ִ� ����� : " + function(400, 300, 750));

	}

}
