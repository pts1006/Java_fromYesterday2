/*
	����� ���� �Լ�, �� ��° �ð�.
	
		1. ��� �� K��°�� ���� ���� ã�� ���α׷��� �ۼ�.
		
			�ؿ� ��.
		
		
		2. ���ڿ����� ������ �ܾ ��ȯ�ϴ� �Լ��� �ۼ�.
		
		 	Main2.java ���Ͽ� ����.
		 
		3. max()�� �̿��Ͽ� �ִ��� �����ϴ� ���α׷��� �ۼ�.
		
			Main3.java ���Ͽ� ����.
*/
public class Main {

	public static int function(int number, int k) {
		for (int i = 1; i <= number; i ++) {
			if(number % i == 0) {
				k--;
				if (k == 0 ) {
					return i;
				}
			}
		} return - 1;
	}
	
	public static void main(String[] args) {
		
		int result = function(3050, 10);
		
		if (result == -1) {
			System.out.println("3050�� 10��° ����� �����ϴ�.");
		} else {
			System.out.println("3050�� 10��° ����� " + result + "�Դϴ�.");
		}

	}

}
