/*
 	������.
 		
 		1. �ʸ� �Է� �޾� �� �� �� ������ ����ϴ� ���α׷� �ۼ�.
 			final static int SECOND = 1000;
 			
 			int minute = SECOND / 60;
			int second = SECOND % 60;
		
			System.out.println(minute + "��" + second + "��");
 		
 		
 		2. ++�� --������ ������ �ٸ��� �����ϰ� ���α׷��� �ۼ�.
 			int a = 10;
			System.out.println("������ a��" + a + "�Դϴ�.");
			a++;
			System.out.println("������ a��" + a + "�Դϴ�.");
			System.out.println("������ a��" + ++a + "�Դϴ�.");
			System.out.println("������ a��" + a++ + "�Դϴ�.");
			// ++a �� a++�� ����
			// ++a�� ��ȣ �ȿ��� a�� 1�� ���� �� a�� ���.
			// a++�� ���� ����� ���Ŀ� a�� 1�� ���� ��. ��, ������ ���� sysout���� 1�� �� ������ ��. �ؿ� ó��.
			System.out.println("������ a��" + a + "�Դϴ�.");
			// �̷��� �ܼ� a�ε��� ����� 13�� ������ ��.
 		
 		3. %�������� ������ �����ϰ� ���α׷��� �ۼ�.
 			'������ ��'�� ����μ� ����
 				ex) i = 10 % 3 // 1
 				
 		4. ==, >, <, &&, ||, ! ������ ������ �ٸ��� �����ϰ� ���α׷� �ۼ�.
 			&& : and ������
 			|| : or ������
 			!  : �ݴ��. (������ ��������, ������ ��������)
 				ex)
 					int a = 50;
					int b = 50;
					
					System.out.println("a�� b�� ��������? " + (a == b));
					System.out.println("a�� b���� ū����? " + (a > b));
					System.out.println("a�� b���� ��������? " + (a < b));
					System.out.println("a�� b�� �����鼭 a�� 30���� ū����? " + ((a == b) && (a > 30)));
					System.out.println("a�� 50�� �ƴѰ���? " + !(a == 50));
 		
 		5. '���� ? �� : ����' ������ ���¸� �����ϰ� ���α׷��� �ۼ�.
 			���� ���� ���� "���� ������"��� �Ѵ�.
 				ex)
 				public static void main(String[] args) {
		
					int x = 50;
					int y = 60;
					
					System.out.println("�ִ��� " + max(x, y) + "�Դϴ�.");
				}
					// �Լ� ���� ��� ��ȯ��, �Լ� �̸�, �Ű� ������ ���� ��.
					static int max(int a, int b) {
						int result = (a > b) ? a : b; // a�� b���� Ŀ? �׷��� a�� ���, �ƴ϶�� b�� �����.
						return result;
				}
					// ���� ���� int a�� int b �� �� ū ����(max) ��ȯ �޴� �Լ�.
					// ��°��� �翬�� "�ִ��� 60�Դϴ�."�� ����. (a�� b���� ũ�� �����ϱ� b �� ���.)
 			
 		6. pow()�� �̿��� �ŵ����� ���� ���α׷��� �ۼ�.
 			��� pow�� �Լ��� �����.
 				ex)
 					�ؿ� ����.
*/
public class Main {

	
	
	public static void main(String[] args) {
		
		double a = Math.pow(3.0,  20.0);
		System.out.println("3�� 20������ " + a + "�Դϴ�.");
		
	}
	
	/*
	 	
	 	1. i++�� ++i�� ���� ���� ������Ű���� �����̶�� �� ����� �����ϴٰ� �� �� �ִ�.
	 	
	 	2. 100 < x < 200�� �߸��� ǥ���̴�.
	 		(100 < x) && (x < 200)�� ǥ���ϴ� ���� ���� ���� �� ǥ���̴�.
	 	
	 	3. i++�� i += 1�� ������ ǥ���̴�. ���� i = i + 1���� ������ ǥ���̴�.
	 		���� �ĵ��� ��� <i�� ���� 1��ŭ ���� ��Ų��>�� �ǹ̸� ������ �ִ�.
	 	
	 */
	
}