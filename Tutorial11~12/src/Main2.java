/*
	�ݺ� �Լ��� ��� �Լ�.
	
		1. ���丮���� �ݺ� �Լ��� ����.
		
		2. ���丮���� ��� �Լ��� ����.
		
		3. �ĺ���ġ ������ �ݺ� �Լ��� ����.
		
		4. �ĺ���ġ ������ ��� �Լ��� ����.
	
*/
public class Main2 {
	
	// ���� : factorial �̶�?   5! = 5 * 4 * 3 * 2 * 1 = 120

	public static int factorial(int number) {
		
		if(number ==1)
			return 1;
		else
			return number * factorial(number - 1);
	} // �� number - 1�̳�?  ~>  5! = 5 * 4! �̱� ������. ���� 4�� (5-1)�� �Ǿ ���� ����.
	
	public static void main(String[] args) {
		
		System.out.println("10 ���丮���� " + factorial(10));

	}

}
