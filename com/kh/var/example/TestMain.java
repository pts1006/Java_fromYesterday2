package com.kh.var.example;

import java.util.Scanner;

public class TestMain {

	public void example1() {
		
		int[] number = new int[2] ;
		
		int A = 0;		// ���� �� �ص� �Ǵµ�, �ؿ� ���� ���� ���Ϸ��� ����.
		int B = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < number.length; i++) {
			System.out.print("Enter a int : ");
			number[i] = scan.nextInt();
		}
		
		A = number[0];
		B = number[1];
		
		System.out.println("Plus result : " + (A + B) + " --> " + A + " + " + B);
		System.out.println("Minus result : " + (A - B) + " --> " + A + " - " + B);
		System.out.println("Multiply result : " + (A * B) + " --> " + A + " * " + B);
		System.out.println("Divide result : " + (A / B) + " --> " + A + " / " + B);
		System.out.println("Modular result : " + (A % B) + " --> " + A + " % " + B);
		
		scan.close();
		
}
	
	public void example2() {
		
		// ���� ���� �� �ް� ��갪 ���.
		
		double[] number = new double[2];
		
		double RowValue = 0;	// �Է� �� ����ϰ��� �ϴ� �� ���� �˾ƺ��� ���� �Ϸ��� ����.
		double ColumnValue = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < number.length; i++) {
			System.out.print("Enter a Double : ");
			number[i] = scan.nextDouble();
		}
		
		RowValue = number[0];
		ColumnValue = number[1];
		
		System.out.println("Area : " + (RowValue * ColumnValue));
		System.out.println("Round : " + (RowValue + ColumnValue) * 2);
		scan.close();
		
	}
	
	public void example3() {
		
		//����� �� ���ڿ� �ް�, ó������ �� ��°�� �ش��ϴ� �ܾ���� ���.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("English String : ");
		String str = scan.nextLine();
		
		for(int i = 0; i < 3; i++) {
			str.substring(i, i + 1);
			System.out.println(str.substring(i, i + 1));
		}	
		
		scan.close();
		
	}

}
