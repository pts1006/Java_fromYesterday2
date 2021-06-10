/*
	�ݺ� �Լ��� ��� �Լ�.
	
		1. ���丮���� �ݺ� �Լ��� ����.
		
		2. ���丮���� ��� �Լ��� ����.
		
		3. �ĺ���ġ ������ �ݺ� �Լ��� ����.
			�Ǻ���ġ ? ~> �� ���� ���� ���ļ� �� ���� ���� ����� ����.
				ex) 1 1 ~> 2
					1 2 ~> 3
					2 3 ~> 5
					3 5 ~> 8
					
			�� �ð��� �ϴ� �� Ư�� x ���� �־��� �� �� ��°�� �ش��ϴ� ���� � ���� ���ߴ� ��.
			��, �� ��° ���� �������� �� �Ǻ���ġ ���� �߿��� � ������ ���ߴ� �Լ�.
		
		4. �ĺ���ġ ������ ��� �Լ��� ����.
	
*/
public class Main3 {
	
	public static int fibonacci(int number) {
		
		int one = 1;
		int two = 1;		// �� ���� ���� ���� �ʿ䰡 ����. (�Ǻ���ġ�ϱ�.)
		int result = -1;	// ������ �� ������ �� ����.
		
		if (number == 1) {
			return one;
		} else if (number == 2) {
			return two;
		} else {
			for (int i = 2; i < number; i++) {
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("�Ǻ���ġ ������ 10��° ���Ҵ� " + fibonacci(10) + "�Դϴ�.");

	}

}
