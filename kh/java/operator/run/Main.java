package kh.java.operator.run;

import java.util.Scanner;

public class Main {
	
	public void opSample1() {
		
		// �� �� �� ���� �Է� �ް� ������ ������� �հ� ���հ� �Ǻ�.
		
		int Language = 0;
		int English = 0;
		int Mathematics = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Language : ");
		Language = sc.nextInt();
		
		System.out.print("English : ");
		English = sc.nextInt();
		
		System.out.print("Mathematics : ");
		Mathematics = sc.nextInt();
		
		int Score = Language + English + Mathematics;
		double Average = Score / 3;
		
		if(Language >= 40 && English >= 40 && Mathematics >= 40 && Average >= 60) {
			System.out.println("You pass.");
		} else {
			System.out.println("You fail.");
		}

		sc.close();
		
	}
	
	public void opSample2() {
		
		//�л� ���� �Է� �ް� ��� �ϱ�.
		//����  >>>>>>>> Test2 ���Ͽ��� Ǯ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		
		System.out.print("�� : ");
		int StudentClass = sc.nextInt();
		
		System.out.print("��ȣ : ");
		int StudentNumber = sc.nextInt();
		
		System.out.print("���� : ");
		String gender = sc.next();
		
		for(int i = 0; i < 1; i++) {
			
			if(gender == "M") {	// �� �κ��� �� ��.
				System.out.println("���л�");	// ���� 1. "m"�̳� "M"�̳� "��" �� ������ �� �� �ִ� ���� �Է� ������ "���л�"�̶�� ���ڰ� ��µǰ� �ϰ� ������, �Է� ���� ���� �״�� ����ع���.
			} else if (gender == "W") {
				System.out.println("���л�");
			} else {
				System.out.println("�ٽ�"); // ���� 2. ���л� �������� ���л� �������� �ƴ� �ٸ� ���� �Է����� �� ������ �ϰ� ������, �ƹ� ���� �� Ƣ�� ����.
				continue;
			}
		}
		
		System.out.print("���� : ");
		double grades = sc.nextDouble();
		
		System.out.println(grade + "�г� " + StudentClass + "�� " + StudentNumber + "�� " + gender.charAt(0) + " " + name  + "�� " +  grades + "�̴�.");
		
		sc.close();
		
		
	}
	
	public void opSample3() {
		
		// ��� ���� �Ǻ� ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		
		if(number > 0) {	// 0 ���� ũ�� ���.
			System.out.println("�����.");
		} else if(number < 0) {	// 0���� ������ ����. �� ����� �ƴϴ�.
			System.out.println("����� �ƴϴ�.");
		} else {
			System.out.println("0�� ����� ������ �ƴ�, ������ �����̴�.");
		}
		// ������ number > 0 ���� else�� ��� '0���� ������ ����� �ƴϴ�'�� ������ �κ��ε�
		// �׷��� �Ǹ� '0' ���� '����� �ƴϴ�'�� ������, else if�� �� ���� ������ ��.
		
		sc.close();
			
	}

	public void opSample4() {
		
		// Ȧ¦ �Ǻ� ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		
		String str = null;	// ���� �䱸 ����.
		
		if(number % 2 == 0) {	// 2�� ������ �� �ƹ��͵� ���� ������ ¦��. (0�� ¦����.)
			str = "¦����.";
		} else {				// �� �ݴ�� Ȧ��.
			str = "Ȧ����.";
		}
		
		System.out.println(str);
		sc.close();
		
	}
	
	public static void main(String[] args) {
		

		
	}
}
