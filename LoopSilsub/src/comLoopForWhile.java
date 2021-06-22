import java.util.Scanner;

//���������
public class comLoopForWhile {

	public void printStar1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�(�����) : ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			for(int i = 1; i <=num; i++) {	// �ؿ� �ִ� j for������ (j < i)���� ������Ű�� ���� �ʱ� i���� 1�� �����ϰ� ������ <�� �ƴ� <=�� ����.
				System.out.println(i);
				for(int j = 0; j < i; j++) {
					if(i == num) {
						break;		// �극��ũ�� ���� ���� �� j�� i�� ���� ���� ���� �� �����Ƿ� ����ؼ� Ŀ�� ������.
									// ���ϴ� ��ǥ ������ ���� ���� ���Ѥ� num�̹Ƿ� (i == num)��� ���Ǻθ� �� ��.
					}
					System.out.print("*");
				}
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
		
		sc.close();
	}
	
	public void printStar2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 0; i < num; i++) {		// i���� num�� ������ ���� �� i�� ����ؼ� Ŀ����. (��ü�� �ݺ� Ƚ��, �� ���� ���� ���̸� �ǹ�. �̶��� num�� �� �ݺ� Ƚ���� �ش��Ѵ�.)
				for(int j = 0; j <= i; j++) {	// j���� i������ �۰ų� ������ j�� ����ؼ� Ŀ����. (������ ������ �ݺ� Ƚ���� �ǹ�)
					System.out.print("*");	// ex) �ʱ⿡�� j = 0�ε� i = 0�̴�. �̶� j�� i�� ���ų� �׺��� ���� �� �����Ϸ��� j���� Ŀ�� �ʿ� ���� �״� ���߸� �ȴ�.
				}							//		�� �� �ݺ������� ������ j = 0�̰� i = 1���� �����Ѵ�. j���� 0�̾��ٰ� Ŀ���� 1�� �Ǿ� Ƚ���� 2�� �ȴ�.
											//		�̷� ������ j�� 0, 1, 2, ... ��� Ŀ���ٰ� i���� num���� �����ϴ� ������ �Բ� �����. (������ ����µ� ������ ���ư� ���� ����.)
				System.out.println();		// �̴� j for���� �ӹ��� �ϼ����� �� ���� �ٷ� �Ѱ� �ֱ� ����.(i for���� �ɷ� �ִ�.)
			}
			
		} else if(num < 0) {				// ������ �����Ѵ�.
			for(int i = 0; i > num; i--) {	// �ʱ� i�� 0���� �� ��, num���� �����̱� ������ �ε�ȣ�� �ݺ� ������ ����� �ݴ�.
				for(int k = 0; k > i; k--) { // �ʱ⿡�� i = k���� �𸣳�, �� ��°���ʹ� i�� Ŀ�� ���ڷ�, k�� 0���� �����̹Ƿ� �� ������ ����.
					System.out.print(" ");	// ���� ó���� ��µ��� �ƴ��ϰ�, �� ��°���� ���ʿ��� ��µǱ� �����Ѵ�.
				}							// println�� �ƴ� print�̹Ƿ� ���⼭ ��µ� ���� �ļ��� �̾ ÷���� �� �ִ�.
				for(int j = num; j < i; j++) {	// �߰��Ǵ� ���� *. *�� �ִ�(�ʱ�) ������ num�� �����ϰ�, Ƚ���� i�� �������� ������.
					System.out.print("*");
				}
				System.out.println();		// ��������� ���� ū for���� ��.
			}
		} else {	// �ռ� ���� �� if���� ���� ��� ������ �ٷ�Ƿ� �� ��������� �ϸ� 0�ۿ� ����.
			System.out.println("��� ����� �����ϴ�.");
		}
		
		sc.close();
	}
	
	public void selectMenu() {
		
		// �̿ϼ�

		String[] menu = new String[9];
		
		String[] hamburger = {"�ܹ���", "�Ұ�����", "ġŲ����"};
		String[] side = {"�߰�", "����Ƣ��", "ġ�ƽ", "������"};
		String[] drink = {"�����", "�ݶ�", "���̵�", "Ŀ��"};
		
		menu[0] = null;
		menu[1] = hamburger[1];
		menu[2] = hamburger[2];
		
		menu[3] = side[1];
		menu[4] = side[2];
		menu[5] = side[3];
		
		menu[6] = drink[1];
		menu[7] = drink[2];
		menu[8] = drink[3];
		
		int[] price = new int[9];	// �̷� �� �ƴ϶� ���� menu[]�� ������ �����ؾ� �� �� ������.
		price[0] = 0;
		price[1] = 3500;
		price[2] = 3200;
		price[3] = 1000;	// �ߺ� �߻�
		price[4] = 400;
		price[5] = 2000;
		price[6] = 700;
		price[7] = 1200;
		price[8] = 1000;	// �ߺ� �߻�	// �Ϻη�. �ؿ� priceResult�� �����Ϸ���
				
		System.out.println("*** �޴��� �����ϼ��� ***");
		
		System.out.println();
		
		/*
		sadfsadfasdf 		fff
		f					
		*/
		System.out.println(hamburger[0] + "***************");
		System.out.println("1." + hamburger[1] + "\t" + price[1]);
		System.out.println("2." + hamburger[2] + "\t\t" + price[2]);
		System.out.println(side[0] + "****************");
		System.out.println("3." + side[1] +	"\t\t" + price[3]);
		System.out.println("4." +side[2] +	"\t\t" + price[4]);
		System.out.println("5." + side[3] +	"\t\t" + price[5]);
		System.out.println(drink[0] + "****************");
		System.out.println("6." + drink[1] + "\t\t" + price[6]);
		System.out.println("7." + drink[2] + "\t\t" + price[7]);
		System.out.println("8." + drink[3] + "\t\t" + price[8]);
		System.out.println("********************");
		
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ���� : ");
		int number = sc.nextInt();
		
		String result = null;
		int priceResult = 0;
		
		for(int i = 1; i <= number; i++) {
			if(number == i) {
				result = menu[i];
				priceResult = price[i];
				System.out.println(result + "�� �����ϼ̽��ϴ�.");
			}
		}
		
		System.out.print("\n������ ? ");
		int Count = sc.nextInt();
		System.out.println(Count + "�� �ֹ� �ϼ̽��ϴ�.");
		
		
		System.out.print("\n�߰� �ֹ��Ͻðڽ��ϱ�?(y/n) : ");
		String Answer = sc.next();
		
		if(Answer.equals("y") || Answer.equals("Y")) {
			System.out.println("���� ��");
		} else if(Answer.equals ("n") || Answer.equals("N")) {
			System.out.println("�ֹ��Ͻ� ������ ������ �����ϴ�.");
			System.out.println("-----------------------------------------------");
			System.out.println(result + " : " + Count + "��" + " - " +  priceResult * Count + "��");
		} else {
			System.out.println("y�� n, �� �� �ϳ������� �ٽ� �Է��� �ּ���.");
		}
		
		sc.close();
		
	}
	
	public void countInputCharacter() {
		
		// �̿ϼ� else �κ�. >>>>>>>>> Test2 ���Ͽ��� Ǯ���� ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.next();
		
		System.out.print("���� �Է� : ");		// �����ڰ� �ƴ� ��� �̰� ��� �� �ǰ� �Ϸ��� �����?
		char cha = sc.next().charAt(0);		// for���̳� if�� ������ ������ ������ �ݺ��� �������µ�
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {	// �ݺ� Ƚ���� ���ڿ��� �Էµ� ������ ������ŭ
			if(str.charAt(i) >= 0x41 && str.charAt(i) <=0x7A) {	// ���ڿ� str�� ���Ե� ���� �ϳ��ϳ��� �� �빮������ �ҹ������� Ȯ���ϴ� ��
				if(cha == str.charAt(i)) {	// ������ �Էµ� ���� �ϳ��� ���ڿ� str���� ������ �ϳ��� ���� ���,
				count++;					// count�Ѥ� ������ �ø���.
				}
			}
			else {	// ������ ������ ��� �� �ƴ� ��� �ؿ� �׸��� ���.
				System.out.println("�����ڰ� �ƴմϴ�.");
				break;
			}
			
		} 
		
		System.out.println("���Ե� ���� : " + count + "��");
		sc.close();
		
		
	}
	
}
