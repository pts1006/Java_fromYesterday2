import java.util.Scanner;

/*
	�迭
	: �����Ͱ� ���� �� �� ���� �����͵��� ȿ�������� ó���ϰ� �����ϵ��� �� �ִ� �ϳ��� �ڷ���.
	
		��ǥ : �迭�� ������ ����Ͽ� ���� �����͸� ó��.
		
			1. ���ϴ� ������ŭ�� �迭 ���� �� �ִ� ���ϴ� ���α׷��� �ۼ�.
		
			2. ���� ���� 100���� ����� ���ϴ� ���α׷��� �ۼ�.

*/
public class Main {

	public static int max (int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ��� : ");
		int number = scanner.nextInt();
		
		int[] array = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.print("�迭�� �Է��� ������ �ϳ��� �Է��ϼ��� (���) : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;		// -1 ���� ������ �ٷ� ���� �Ķ� �۾����� �迭�� �Է��� ���� ����� �����߱� ����. ���� for���� �ִ� ������ ���� �˰����� ��� ���� ������ ���� �� ����. ���� ��������� ����� ������ �Լ��� ����� �� �� �ִ�.
		for (int i = 0; i < number; i++) {
			result = max(result, array[i]);
		}	// �� ) ��33�� result�� ���� �μ��� ������ 5���̰� ���� 7,8,9,10,11�� ���, ��31�� result���� -1�� ���ؼ� �� Ŭ ���ۿ� ����. �� ��� ���������� result���� 11�� ���� ��. (�迭 �� �ִ��� ���Ϸ��� �ۼ��� �Լ��ϱ�.)
		System.out.println("�Է��� ��� ���� �߿��� ���� ū ���� : " + result + "�Դϴ�.");
		
		scanner.close();
	}
		// �𸣰����� �ڵ� ���� ������ ����.
}
