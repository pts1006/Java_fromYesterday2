package cast.practice;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode() {
		
		// 문자 하나를 입력 받아, 그 문자의 유니코드를 출력되게 한다.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String : ");
		
		char Code = scn.nextLine().charAt(0);
		
		System.out.printf("%c : ", Code);
		
		int Alpa = (int)Code;
		
		System.out.println(Alpa + " is unicode : " + Alpa);

		scn.close();
		
	}
	
	public void calculatorScore() {
		
		// 실수형으로 국, 영, 수 세 과목의 점수를 입력 받아 총점과 평균을 계산해서 출력한다. (계산된 값은 정수.)
		
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
		
		// 정수를 입력 받아, 그 정수의 2진수 값에서 1의 개수가 몇개인지 출력.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a int : " );
		
		// 정수형으로 내려 받는다.
		int A = sc.nextInt();
		
		// 2진수로 변환하는 변수를 미리 적어 둔다.
		String binaryString = Integer.toBinaryString(A);
		
		// 반복문을 통해 '1' 의 개수가 나올 때, 그것을 세어 줄 변수를 초기화한다.
		int count = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1') count++;
		}
		// 2진수에서 1의 개수를 찾아야 하는 거니 for문의 범위는 변수 binaryString(2진수 값에 해당)의 길이로 지정.
		// 나아가, if 문에서 만약 2진수 내에 1이 있다면 count(1의 개수를 세어 줄 변수)의 값을 차차 증가시키게 설정. (binaryString 즉 2진수 형태가 배열로 설정돼 있기에 가능)
		
		
		System.out.println("Character 'a' : " + count);
		sc.close();
		
	}
	
}
