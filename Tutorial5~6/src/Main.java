/*
 	���ǹ��� �ݺ���.
 	
 		1. if���� �̿��Ͽ� ���ڿ��� Ư�� ���ڿ��� �����ϴ��� Ȯ���ϴ� ���α׷��� �ۼ�.
 			
 			String a = "I Love You";
			if(a.contains("Love")){
				// �����ϴ� ��� ����Ǵ� �κ�
				System.out.println("Me Too.");
			} else {
				//���Ե��� ���� ��� ����Ǵ� �κ�
				System.out.println("I Hate You.");
			}
 		
 		
 		2. ������ ���� �ٸ� �޽����� ����ϴ� ���α׷��� �ۼ�.
 		
 			int score = 95; 
		
			if(score >= 90) {
				System.out.println("A+�Դϴ�.");
			} else if (score >= 80){
				System.out.println("B+�Դϴ�.");
			} else if (score >= 70){
				System.out.println("C+�Դϴ�.");
			} else {
				System.out.println("F�Դϴ�.");
			}

 		
 		3. ���ڿ��� �������� ���� ���ǹ��� �̿��� Ȱ���� ���� �� �������� ����.
 		
 			String a = "Man";
			int b = 0;
			
			// �ڹٴ� String�� ���� �� equal()�� �̿��Ѵ�.
			// �� ������ String�� �ٸ� �ڷ������� �ٸ�, ���ڿ� �ڷ����̱� ����.
			
			if(a.equals("Man")) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("���ڰ� �ƴմϴ�.");
			}
	
			
			if(b == 3) {
				System.out.println("b�� 3�Դϴ�.");
			} else {
				System.out.println("b�� 3�� �ƴմϴ�.");
			}
			
			
			if(a.equalsIgnoreCase("man") && b == 0) {
				System.out.println("���Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
 		
 		4. while�� �̿��� 1���� 1000������ ���� ����ϴ� ���α׷��� �ۼ�.
 		
 			int i = 1, sum = 0;
			while(i <= 1000) {
				sum += i++;
			}
			System.out.println("1���� 1000������ ���� " + sum + "�Դϴ�");
 		
 		5. for ���� �̿��Ͽ� �ﰢ���� ����ϴ� ���α׷��� �ۼ�.
 			
 			for�� : �ʱ�ȭ �κ�, ���� �κ�, ���� �κ����� ����
 			���� for���� �̿��� �ﰢ���� ����� ����. ( ��� ������� ������ ���� �� �ﰢ������ ���̱⸸ �ϸ� ��)
 			
 			
	 			final static int N = 30;
	
				public static void main(String[] args) {
					
					for(int i = N; i > 0; i--) {
						for(int j = i; j > 0; j--) {
							System.out.print("��");
						}
						System.out.println();
					}
					
				}
			
		6. for���� �̿��� ���� ����ϴ� ���α׷��� �ۼ�.
			
			�ؿ� ����.
		
 	
 */
public class Main {
	
	final static int N = 15;

	public static void main(String[] args) {
		
		
		// x^2 + y^2 = r^2  ~> ������ �߽����� �ϴ� ���� ������
		
		for(int i = -N; i <= N; i++) {
			for(int j = -N; j <= N; j++) {
				if(i * i + j * j <= N * N) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		/*
		  	
		  	1. �ϳ��� �� �����ڴ� true Ȥ�� false�� ��ȯ�ϰ� �ȴ�.
		  	
		  	2. ��� ���ǹ�, �ݺ��������� �����ؼ� ������ ��ȣ�� �����ض�.
		  	
		  	3. for�� Ȥ�� while���� �󸶵��� ��ø�� �� �ִ�.
		  	
		  	4. for(;;)�� while(true)�� �Ȱ��� ���� ������� �ǹ̷� �����Ѵ�.
		  	
		  	5. break;�� �̿��� �ݺ����� ��� �������� �� �ִ�.
		  	
		 */
		
	}

}
