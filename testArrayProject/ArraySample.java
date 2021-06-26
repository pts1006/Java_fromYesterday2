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
	
		// 난수 값 100개 받고 싹 다 더하기.
		
		Random rand = new Random();
		
		int sum = 0;
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
			sum += arr[i];
			System.out.println(arr[i]);	// 문제에선 요구하지 않았음. 잘 된 건지 확인하려고 적었음.
			
		}
		
		System.out.println("arr[9] + arr[8] + arr[7] + .... arr[0] = " + (sum));
		
	}
	
	public void test2() {
		/*
		 답은 잘 나오는데, 이 식은 좋지 않음.
		 max와 min값을 바깥 제일 위에서 설정해버렸기 때문에 둘의 값이 for문이 작동하기 전인 초기값 0으로 설정 됨.
		 또한 if문도 문제인데, 지정되는 값들에서 좌항과 우항 순서가 바뀌면 의미가 달라져버림.
		 */
		// 배열에서 최댓값 최솟값 찾기.
		
		int[] arr= new int[10];
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;	// 문제 지시 사항.
			System.out.println(arr[i]);
				
			
			if(i == 0) {
				min = arr[0];	// 0번째 일때는 정수가 하나 뿐임. 그러니 최솟값이 맞음.
			}
				if(max < arr[i]) {
					max = arr[i];	// 반복문 돌리면서 max(초기값 0)에 arr[i] 대입. 다 돌렸을 때 이보다 큰 값이 존재한다면 그 값(arr[i])이 최대값. 없을 테니 이게 최대 값. 
				}
				
				if(min > arr[i]) {
					min = arr[i];	// 지정갑(min)보다 작은 값이 존재한다면 그 값이 최솟값.
				}
			
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	}
	
	public void test3() {
		
		//난수 발생 시킨 뒤 짝수 값 끼리의 합계 출력.
		
		byte[] bArr = new byte[10];
		
		Random random = new Random();
		random.nextBytes(bArr);
		
		int even = 0;
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] % 2 == 0) {	// 2로 나누었을 때 0이면 짝수.
				System.out.println(bArr[i]);	// 짝수 값 받음.
				even += bArr[i];	// even = even + bArr[i]; 반복 될 수록 값이 커진다.
			}
		}
		System.out.println("sum is " + even);
		
	}
		
	public void test4() {
		
		//숫자로 된 문자열 입력 받고, 각 자리의 숫자들 합을 구해 출력.

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자로 된 문자열을 입력해라 : ");
		String str= scanner.nextLine();		// 받는 값은 숫자이되, String 지정으로 문자열을 받게 됨.
		
		int sum = 0;	// 합을 구하는 문제이니 미리 초기화.
		
		for(int i = 0; i < str.length(); i++) {
			 sum += Integer.parseInt(str.substring(i, i + 1));
			// substring()은 해당 문자열에서 () 만큼 범위를 지정하여 추출하는 함수.
		}
		
		System.out.println("합계 : " + sum);
		scanner.close();
		
	}	
	
	public void test5() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자로 된 문자열 입력 : ");
		String str = scan.nextLine();
		
		/*	
			
		기본형 변수인 char는 단 한 글자만을 저장할 수 있는 변수.
		Scanner로 문자를 입력을 받을 때는 String 타입으로 밖에 받을 수 없기 때문에 등장하게 됨.
		
		char는 String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해 준다.
		달리 말해, charAt()을 사용하려면 String 타입의 문자열이 필요하다.
		
		
		char = '문자' 한 개를 저장하는 자료형. (※ 숫자 X)
				
		*/
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum = sum + str.charAt(i) - 48;
			
			/*	
			
			char는 ASCII코드 48부터 시작하므로, 식에서 48을 빼 주면 얻고자 하는 '숫자'를 얻을 수 있다.
			혹은 '0'을 빼도 가능. (※ 자바에서 문자는 작은 따옴표, 문자열은 큰따옴표로 묶는다.)
			
			단, 한 자리 숫자만 가능하다고 한다.
			
			*/
			
		}
		
		System.out.println("합계 : " + sum);
		scan.close();
		
	}
	
	public void test6() {
		
		//달력 문제
		//보류
		
				//0123456789
		String personID = new String("881225-1234567");
		
		String gender = personID.substring(7, 8);
		/*
		try - catch 문은 IO 입출력 I = INPUT O = OUTPUT
		이제 입출력이라는 IO 시스템을 사용하게될때 오류가 날수도 있어.
		근데 오류가나면 무조건 try catch문을 사용해줘야 하는 규칙이있어. if else 와는 별개로 
		*/
	
		Date date = new Date();
		try {
			date = new SimpleDateFormat("yyMMdd", Locale.KOREAN).parse(personID.substring(0,6));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /* finally {
			System.out.println("와라와라");
		} */
		
		GregorianCalendar calendar = new GregorianCalendar();	
		calendar.setTime(date);
		
		int Year = Integer.parseInt(personID.substring(0, 2));
//		int Month = Integer.parseInt(personID.substring(2, 4));
//		int Day = Integer.parseInt(personID.substring(4, 6));
		
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(days[calendar.getFirstDayOfWeek()-1]);
//		String Birth = Year + Month + Day;
//		System.out.println(Birth);
		
		if(Integer.parseInt(gender) == 1) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		calendar.get(Calendar.YEAR);
		
		
	}
	
}