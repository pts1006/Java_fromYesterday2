package testArrayProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	
	public void test1() {
	
		// ���� �� 100�� �ް� �� �� ���ϱ�.
		
		Random rand = new Random();
		
		int sum = 0;
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
			sum += arr[i];
			System.out.println(arr[i]);	// �������� �䱸���� �ʾ���. �� �� ���� Ȯ���Ϸ��� ������.
			
		}
		
		System.out.println("arr[9] + arr[8] + arr[7] + .... arr[0] = " + (sum));
		
	}
	
	public void test2() {
		/*
		 ���� �� �����µ�, �� ���� ���� ����.
		 max�� min���� �ٱ� ���� ������ �����ع��ȱ� ������ ���� ���� for���� �۵��ϱ� ���� �ʱⰪ 0���� ���� ��.
		 ���� if���� �����ε�, �����Ǵ� ���鿡�� ���װ� ���� ������ �ٲ�� �ǹ̰� �޶�������.
		 */
		// �迭���� �ִ� �ּڰ� ã��.
		
		int[] arr= new int[10];
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;	// ���� ���� ����.
			System.out.println(arr[i]);
				
			
			if(i == 0) {
				min = arr[0];	// 0��° �϶��� ������ �ϳ� ����. �׷��� �ּڰ��� ����.
			}
				if(max < arr[i]) {
					max = arr[i];	// �ݺ��� �����鼭 max(�ʱⰪ 0)�� arr[i] ����. �� ������ �� �̺��� ū ���� �����Ѵٸ� �� ��(arr[i])�� �ִ밪. ���� �״� �̰� �ִ� ��. 
				}
				
				if(min > arr[i]) {
					min = arr[i];	// ������(min)���� ���� ���� �����Ѵٸ� �� ���� �ּڰ�.
				}
			
		}
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);

	}
	
	public void test3() {
		
		//���� �߻� ��Ų �� ¦�� �� ������ �հ� ���.
		
		byte[] bArr = new byte[10];
		
		Random random = new Random();
		random.nextBytes(bArr);
		
		int even = 0;
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] % 2 == 0) {	// 2�� �������� �� 0�̸� ¦��.
				System.out.println(bArr[i]);	// ¦�� �� ����.
				even += bArr[i];	// even = even + bArr[i]; �ݺ� �� ���� ���� Ŀ����.
			}
		}
		System.out.println("sum is " + even);
		
	}
		
	public void test4() {
		
		//���ڷ� �� ���ڿ� �Է� �ް�, �� �ڸ��� ���ڵ� ���� ���� ���.

		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڷ� �� ���ڿ��� �Է��ض� : ");
		String str= scanner.nextLine();		// �޴� ���� �����̵�, String �������� ���ڿ��� �ް� ��.
		
		int sum = 0;	// ���� ���ϴ� �����̴� �̸� �ʱ�ȭ.
		
		for(int i = 0; i < str.length(); i++) {
			 sum += Integer.parseInt(str.substring(i, i + 1));
			// substring()�� �ش� ���ڿ����� () ��ŭ ������ �����Ͽ� �����ϴ� �Լ�.
		}
		
		System.out.println("�հ� : " + sum);
		scanner.close();
		
	}	
	
	public void test5() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڷ� �� ���ڿ� �Է� : ");
		String str = scan.nextLine();
		
		/*	
			
		�⺻�� ������ char�� �� �� ���ڸ��� ������ �� �ִ� ����.
		Scanner�� ���ڸ� �Է��� ���� ���� String Ÿ������ �ۿ� ���� �� ���� ������ �����ϰ� ��.
		
		char�� String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� char Ÿ������ ��ȯ�� �ش�.
		�޸� ����, charAt()�� ����Ϸ��� String Ÿ���� ���ڿ��� �ʿ��ϴ�.
		
		
		char = '����' �� ���� �����ϴ� �ڷ���. (�� ���� X)
				
		*/
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum = sum + str.charAt(i) - 48;
			
			/*	
			
			char�� ASCII�ڵ� 48���� �����ϹǷ�, �Ŀ��� 48�� �� �ָ� ����� �ϴ� '����'�� ���� �� �ִ�.
			Ȥ�� '0'�� ���� ����. (�� �ڹٿ��� ���ڴ� ���� ����ǥ, ���ڿ��� ū����ǥ�� ���´�.)
			
			��, �� �ڸ� ���ڸ� �����ϴٰ� �Ѵ�.
			
			*/
			
		}
		
		System.out.println("�հ� : " + sum);
		scan.close();
		
	}
	
	public void test6() {
		
		//�޷� ����
		//����
		
				//0123456789
		String personID = new String("881225-1234567");
		
		String gender = personID.substring(7, 8);
		/*
		try - catch ���� IO ����� I = INPUT O = OUTPUT
		���� ������̶�� IO �ý����� ����ϰԵɶ� ������ ������ �־�.
		�ٵ� ���������� ������ try catch���� �������� �ϴ� ��Ģ���־�. if else �ʹ� ������ 
		*/
	
		Date date = new Date();
		try {
			date = new SimpleDateFormat("yyMMdd", Locale.KOREAN).parse(personID.substring(0,6));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /* finally {
			System.out.println("�Ͷ�Ͷ�");
		} */
		
		GregorianCalendar calendar = new GregorianCalendar();	
		calendar.setTime(date);
		
		int Year = Integer.parseInt(personID.substring(0, 2));
//		int Month = Integer.parseInt(personID.substring(2, 4));
//		int Day = Integer.parseInt(personID.substring(4, 6));
		
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(days[calendar.getFirstDayOfWeek()-1]);
//		String Birth = Year + Month + Day;
//		System.out.println(Birth);
		
		if(Integer.parseInt(gender) == 1) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		calendar.get(Calendar.YEAR);
		
		
	}
	
}