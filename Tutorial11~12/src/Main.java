/*
	�ݺ� �Լ��� ��� �Լ�.
	
		1. ���丮���� �ݺ� �Լ��� ����.
		
		2. ���丮���� ��� �Լ��� ����.
		
		3. �ĺ���ġ ������ �ݺ� �Լ��� ����.
		
		4. �ĺ���ġ ������ ��� �Լ��� ����.
	
*/
public class Main {
	
	// ���� : factorial �̶�?   5! = 5 * 4 * 3 * 2 * 1 = 120

	public static int factorial(int number) {
		int sum = 1;  // �ʱ�ȭ �۾���. ������ �� ��� ����� �� �� �����ϱ�.
		
		for (int i = 2; i <= number; i++) {
			sum *= i ;  // sum�� ���, �þ i�� �����ִ� ����
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("10 ���丮���� " + factorial(10));

	}

}
