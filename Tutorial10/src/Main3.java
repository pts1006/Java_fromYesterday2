/*
	����� ���� �Լ�, �� ��° �ð�.
	
		3. max()�� �̿��Ͽ� �ִ��� �����ϴ� ���α׷��� �ۼ�.
		
			Main3.java ���Ͽ� ����.
*/
public class Main3 {

	public static int max (int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int function (int a, int b, int c) {
		int result = max(a, b);   // a�� b �߿��� �� ū ���� result�� �ִ´�.
		result = max(result, c);  // ������ ���� ū �� �� �ϳ��� c�� ���ؼ� �� �߿��� �� �� ū ���� ����� �޴´�.
		return result; 			  // ��������� a, b, c �߿��� ���� ū ���� ����μ� ���� �ȴ�.
	}
	
	public static void main(String[] args) {
		
		System.out.println("(354, 567, 789) �߿��� ���� ū ���� " + function(354, 567, 789));

	}

}
