import java.io.File;
import java.io.FileNotFoundException;

// File�� Scanner�� ����������. import ���� ��� ��.

import java.util.Scanner;

// Scanner Ŭ������ �̿��Ϸ��� ��ó�� �ۼ��ؾ� ��. (Scanner�� �Է��ϸ� �ؿ� ���� ���� ����. ã�Ƽ� Ŭ�����ָ� ��. Ȥ�� ��Ʈ�� + ����Ʈ + o)

/*
	�⺻ �����.
	
		�ռ� ��� ����鿡 scanner Ŭ������ ������ �پ��� ���α׷��� �ۼ�.
		
			1. Ư���� ������ �Է� �޾Ƽ� �״�� ����ϴ� ���α׷��� �ۼ�.
				
				public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);  // sc�� �ν��Ͻ�, ����
				System.out.print("������ �Է��ϼ��� : ");
				int i = sc.nextInt();
				System.out.println("�Է��� ������ " + i + "�Դϴ�.");
				sc.close();
			}
			
			
			2. ���Ͽ� ���ʷ� �Էµ� ��� ������ 100�� ���� ����ϴ� ���α׷��� �ۼ�.
				�̷� ��츦 <���� �����>�̶� ���Ѵ�.
				
				File file = new File("input.txt");  // input.txt ��� ������ �ҷ��ͼ� file������ �װ��� ó���� �� �ֵ��� �� �شٴ� �ǹ�.
				try {
					Scanner sc = new Scanner(file);
					while(sc.hasNextInt()) {
						System.out.println(sc.nextInt() * 100);
					}
					sc.close();
				} catch (FileNotFoundException e) {
					System.out.println("������ �о� ���� ���߿� ������ �߻��߽��ϴ�.");
				}
			
			3. 1�ܺ��� 9�ܱ��� �������� ����ϴ� ���α׷��� �ۼ�.
				������ �� ������. ȥ�� �� �� ��.
*/
public class Main {

	public static void main(String[] args) {
		
		File file = new File("input.txt");  // input.txt ��� ������ �ҷ��ͼ� file������ �װ��� ó���� �� �ֵ��� �� �شٴ� �ǹ�.
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ �о� ���� ���߿� ������ �߻��߽��ϴ�.");
		}
	}
	
	/*
	 	1. �ڹٿ����� Scanner Ŭ������ �� Ȱ���ص� �پ��� ����� ���¸� ��������� ������ �� �ִ�.
	 	
	 	2. �ּ��� �ϴ� �ִ��� ���� �ۼ��ϴ� ������ ������.
	 		�ּ��� ������ �ܰ迡�� ���ŵǱ⿡ ���α׷��� ũ��ʹ� ����� ����.
	 	
	 	3. Scanner�� ���ڿ��� �Է� �ް� ���� ������ next()�Լ��� nextline()�� ������ ���.
	 	
	 */
	
}
