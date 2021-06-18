import java.util.Scanner;

/*
	������ (Polymorphism)
		"�پ��� ������ ������ ������"��� �ǹ�.
			
		�ڹٴ� �⺻������ �������� �� Ư¡���� ���� ��ü ���� ���α׷��� ����̴�.
		�ڹٿ����� �̸� �̿��� ��ü�� ����� ��, ����ϴ� ���� ���¸� �ٲپ� ���� Ÿ���� ��ü�� ������ �� �ִ�.
		�������� �θ� Ŭ���� Ÿ���� ���� ������, ���� Ŭ������ ��ü�� ������ �� �ְ� �� �ش�.
	
	1. �������� �����ϰ� ����Ͽ� �پ��� ���α׷��� ����.
		~> ���� ���� ������Ʈ�� ����.
	
 */
public class Main {

	public static void main(String[] args) {
		
/*		
		
		// �θ� Ŭ������ �����μ�, �ڽ��� �ڽ� Ŭ������ �ν��Ͻ��� �־� �� �� �ִ�.
		// �ٽ�, Peach ��� �ڱ� �ڽ� Ŭ������ �ν��Ͻ��� fruit�̶�� �ڽ��� �ȿ� �־� �� �� �ִ�.
		Fruit fruit = new Peach();
		fruit.show();

	}
	
*/
	
/* �� �ڵ��� �����
		
		�̸� : ������
		���� : 1500
		�ż��� : 75
		
	��� ������� ���� �� �ִ�.
	
	Peach ��� Ŭ����������
	
		price = 1500;
		name = "������";
		fresh = 75;
		
	��� ��������, Fruit�� �� Peach�� ��� �����鼭 �ڱ� �ڽ���
	
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price);
		System.out.println("�ż��� : " + fresh);
		
	�� ������� ����ϰ� �� ����� ��.

*/
		// ��ȭ. �ٳ����� �����, ����ڷκ��� ���� �ް�.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ٳ����� 1��, �����Ƹ� 2�� �Է��Ͻÿ�.");
		int input = scanner.nextInt();
		
		Fruit fruit;
		
		if(input ==1) {
			fruit = new Banana();
			fruit.show();
		} else if(input ==2) {
			fruit = new Peach();
			fruit.show();
		}
		
		scanner.close();
		
	}
}
