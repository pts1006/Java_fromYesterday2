package cast.practice;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode() {
		
		// ���� �ϳ��� �Է� �޾�, �� ������ �����ڵ带 ��µǰ� �Ѵ�.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String : ");
		
		char Code = scn.nextLine().charAt(0);
		
		System.out.printf("%c : ", Code);
		
		int Alpa = (int)Code;
		
		System.out.println(Alpa + " is unicode : " + Alpa);

		scn.close();
		
	}
	
	public void calculatorScore() {
		
		// �Ǽ������� ��, ��, �� �� ������ ������ �Է� �޾� ������ ����� ����ؼ� ����Ѵ�. (���� ���� ����.)
		
		double sub1 = 0;
		double sub2 = 0;
		double sub3 = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Language : ");
		sub1 = sc.nextDouble();

		System.out.print("English : ");
		sub2 = sc.nextDouble();

		System.out.print("Mathematics : ");
		sub3 = sc.nextDouble();

		System.out.println("sum : " + (int) (sub1 + sub2 + sub3));
		System.out.println("Average : " + (int) (sub1 + sub2 + sub3) / 3);
		sc.close();
		
	}
	
	public void printBitCount() {
		
		// ������ �Է� �޾�, �� ������ 2���� ������ 1�� ������ ����� ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a int : " );
		
		// ���������� ���� �޴´�.
		int A = sc.nextInt();
		
		// 2������ ��ȯ�ϴ� ������ �̸� ���� �д�.
		String binaryString = Integer.toBinaryString(A);
		
		// �ݺ����� ���� '1' �� ������ ���� ��, �װ��� ���� �� ������ �ʱ�ȭ�Ѵ�.
		int count = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1') count++;
		}
		// 2�������� 1�� ������ ã�ƾ� �ϴ� �Ŵ� for���� ������ ���� binaryString(2���� ���� �ش�)�� ���̷� ����.
		// ���ư�, if ������ ���� 2���� ���� 1�� �ִٸ� count(1�� ������ ���� �� ����)�� ���� ���� ������Ű�� ����. (binaryString �� 2���� ���°� �迭�� ������ �ֱ⿡ ����)
		
		
		System.out.println("Character 'a' : " + count);
		sc.close();
		
	}
	
}
