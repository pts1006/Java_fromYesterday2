import java.util.Scanner;

//��� ������ Ŭ����
public class silsubSampleMunjae {

	public void test1() {
		
		//�� �� ��, �� ����(int) ���� �ް� ����� ����� �հ� ���� ó��.
		
		// �� �� �� �� ���� �� �Է� �ޱ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int Language = sc.nextInt();
		
		System.out.print("���� : ");
		int English = sc.nextInt();
		
		System.out.print("���� : ");
		int Mathematics = sc.nextInt();
		
		
		int sum = (Language + English + Mathematics); 
		int Average = (Language + English + Mathematics) / 3;	// �հ� ����� ���ǻ�
		
		
		// �޾����� ��� ���.
		
		if(Language >= 40 && English >= 40 && Mathematics >=40 && Average >= 60) {
			System.out.println("\n�հ�\n" + "�� �� �� : " + Language + ", "  + English + ", " + Mathematics + "\n�հ� : " + sum + "\n��� : " + Average);
		} else {
			System.out.println("���հ�");
		}
		
		sc.close();
		
	}
	
	public void test2() {
		
		// ����. �Է°��� default���� �ش��� �� ó������ �ٽ� �����ϵ��� �� �ϳ�? >>>>> Test2 ���Ͽ��� �ذ�.
		
		//switch�� ���
		
		Scanner sc = new Scanner(System.in);
								// \n ���� �������� �ʹ� �������µ�, ��� �� �ϳ�?
		System.out.print("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n7. ����\n\n�޴���ȣ �Է� : ");
		int number = sc.nextInt();
		
		switch(number) {
			case 1 :
				System.out.println("�Է¸޴��� ���õǾ����ϴ�.");
				
				break;
			case 2 :	
				System.out.println("�����޴��� ���õǾ����ϴ�.");
				
				break;
			case 3 :
				System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");
				
				break;
			case 4 :
				System.out.println("�����޴��� ���õǾ����ϴ�.");
				
				break;
			case 7 :
				System.out.println("���α׷��� ����˴ϴ�.");
				
				break;
				
			default :
				System.out.println("\n��ȣ�� �߸� �ԷµǾ����ϴ�.\n�ٽ� �Է��Ͻʽÿ�.");
				
				break;
		}
		
		sc.close();
		
	}
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();

		if(number > 0) {
			System.out.println("�����.");
		} else if (number < 0) {
			System.out.println("����� �ƴϴ�.");
		} else {
			System.out.println("0�� ����� ������ �ƴϴ�.");
		}
		
		sc.close();
		
	}
	
	public void test4() {
		
		// ���� �Է� �ް� ������ �� ���¿��� if�� ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ض� : ");
		int number = sc.nextInt();
		
		String str;
		
		if(number > 0) {
			if(number % 2 == 0) {
			str = "¦����";
			System.out.println(str);
			} else {
				str = "Ȧ����";
				System.out.println(str);
			}
			sc.close();
		}
		
	}
	
	public void test5() {
		
		// �̸�(String), ����(int), Ű(double) ���� ������ �� �Է� �ް�, ����.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		
		// �̸��� null�� �ƴϸ鼭 ���� ������ 0���� ũ��, ���̿� Ű�� ����� ���� ȭ�鿡 ��� ��Ű��.
		if(name != null && name.charAt(0) > 0 && age > 0 && height > 0) {
			System.out.println(name + "�� ���̴� " + age + "�̰�, Ű�� " + height + "cm �̴�.");
		}
		
		sc.close();
		
	}
	
	public void test6() {
		
		// �� ���� �Է� �޾� ��� �� ����ϱ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ѹ� �� ���� �Է� : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("�� = " + (num1 + num2) + "\n�� = " + (num1 - num2) + "\n�� = " + (num1 * num2) + "\n�� = " + (num1 / num2) + "\n������ = " + (num1 % num2));
		}
		
		sc.close();
		
	}
	
	public void test7() {
		
		//���� >>>>>>> Test2���� �ذ�
		
		// ���� if
		// ������ ���� ������ ���� �����ϰ� Ű����� ���� �Է�. ���Ǻο� �¾��� ��� ������ ���� ���.
		
		int score;
		String grades;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		score = sc.nextInt();
		
		// < ��, ������ �ݵ�� 0 �̻��� ���̾�� ��. > �̶�� ������ �ִ���, ���� ��Ĵ�� �ϴ� �� �ƴ� �ٸ� ����� �ֳ�?
		
		if(0 < score && 90 <= score && score <= 100) {
			grades = "A";
		} else if(80 <= score && score < 90) {
			grades = "B";
		} else if(70 <= score && score < 80) {
			grades = "C";
		} else if(60 <= score && score < 70) {
			grades = "D";
		} else {
			grades = "F";
		}
		
		System.out.println("\n���� : " + score + "\n���� : " + grades);
		sc.close();
		
		// �̴�� �ϸ� �Է� ���� 100�� �Ѱų� ������ �� �� �Է°��� ���͸��� �� �Ҹ��������� ����� ����. ��������� Ư������ �����ϰ� ����.
		
	}
	
	
	
}
