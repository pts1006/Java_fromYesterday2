import java.util.Scanner;

/*
  	
  	������ ����, ��� �� �����ϱ�.
  	
 */
public class Main {

	public static void main(String[] args) {
		
		// �ڽ��� �̸��� ����ϴ� ���α׷��� �ۼ�.
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = sc.next();
		
		System.out.println("�� �̸��� " + name + "�Դϴ�. \n");
		
		sc.close();
		
		// ���α׷� ������ ����.
		
		System.out.println(10 + 10);		// 20 
		System.out.println(30 * 30);		// 900
		System.out.println(20 - 5);			// 15
		System.out.println(40 + 3);			// 43
		System.out.println(395 % 18);		// 17
		
		System.out.println();
		
		// �簢�� ���� �����.
		
		for (int i = 0; i < 10; i++) {
			System.out.println("**********");
		} 
		
		// �� �� ��
		System.out.println();
		
		for (int a= 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				System.out.print("��");
			}System.out.println();
		}
		
		System.out.println();
		
		// ������
		
		int z = 2, q = 0;
		
		while (q < 9) {
			q++;
			System.out.println(z + " * " + q + " = " + z*q);
		} 
	} 
}
