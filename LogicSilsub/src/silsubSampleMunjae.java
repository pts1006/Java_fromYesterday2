import java.util.Scanner;

//기능 제공용 클래스
public class silsubSampleMunjae {

	public void test1() {
		
		//국 영 수, 세 과목(int) 점수 받고 평균을 계산해 합격 여부 처리.
		
		// 국 영 수 세 과목 값 입력 받기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int Language = sc.nextInt();
		
		System.out.print("영어 : ");
		int English = sc.nextInt();
		
		System.out.print("수학 : ");
		int Mathematics = sc.nextInt();
		
		
		int sum = (Language + English + Mathematics); 
		int Average = (Language + English + Mathematics) / 3;	// 합과 평균은 편의상
		
		
		// 받았으면 평균 계산.
		
		if(Language >= 40 && English >= 40 && Mathematics >=40 && Average >= 60) {
			System.out.println("\n합격\n" + "국 영 수 : " + Language + ", "  + English + ", " + Mathematics + "\n합계 : " + sum + "\n평균 : " + Average);
		} else {
			System.out.println("불합격");
		}
		
		sc.close();
		
	}
	
	public void test2() {
		
		// 보충. 입력값이 default값에 해당할 때 처음부터 다시 시작하도록 못 하나? >>>>> Test2 파일에서 해결.
		
		//switch문 사용
		
		Scanner sc = new Scanner(System.in);
								// \n 다음 가독성이 너무 떨어지는데, 어떻게 못 하나?
		System.out.print("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n\n메뉴번호 입력 : ");
		int number = sc.nextInt();
		
		switch(number) {
			case 1 :
				System.out.println("입력메뉴가 선택되었습니다.");
				
				break;
			case 2 :	
				System.out.println("수정메뉴가 선택되었습니다.");
				
				break;
			case 3 :
				System.out.println("조회메뉴가 선택되었습니다.");
				
				break;
			case 4 :
				System.out.println("삭제메뉴가 선택되었습니다.");
				
				break;
			case 7 :
				System.out.println("프로그램이 종료됩니다.");
				
				break;
				
			default :
				System.out.println("\n번호가 잘못 입력되었습니다.\n다시 입력하십시오.");
				
				break;
		}
		
		sc.close();
		
	}
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();

		if(number > 0) {
			System.out.println("양수다.");
		} else if (number < 0) {
			System.out.println("양수가 아니다.");
		} else {
			System.out.println("0은 양수도 음수도 아니다.");
		}
		
		sc.close();
		
	}
	
	public void test4() {
		
		// 값을 입력 받고 제한을 건 상태에서 if문 구사.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력해라 : ");
		int number = sc.nextInt();
		
		String str;
		
		if(number > 0) {
			if(number % 2 == 0) {
			str = "짝수다";
			System.out.println(str);
			} else {
				str = "홀수다";
				System.out.println(str);
			}
			sc.close();
		}
		
	}
	
	public void test5() {
		
		// 이름(String), 나이(int), 키(double) 변수 선언한 뒤 입력 받고, 저장.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		
		// 이름이 null이 아니면서 글자 개수가 0보다 크고, 나이와 키가 양수일 때만 화면에 출력 시키기.
		if(name != null && name.charAt(0) > 0 && age > 0 && height > 0) {
			System.out.println(name + "의 나이는 " + age + "이고, 키는 " + height + "cm 이다.");
		}
		
		sc.close();
		
	}
	
	public void test6() {
		
		// 두 정수 입력 받아 계산 값 출력하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("한번 더 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("합 = " + (num1 + num2) + "\n차 = " + (num1 - num2) + "\n곱 = " + (num1 * num2) + "\n몫 = " + (num1 / num2) + "\n나머지 = " + (num1 % num2));
		}
		
		sc.close();
		
	}
	
	public void test7() {
		
		//보충 >>>>>>> Test2에서 해결
		
		// 다중 if
		// 정수와 문자 변수를 각각 선언하고 키보드로 값을 입력. 조건부에 맞았을 경우 점수와 학점 출력.
		
		int score;
		String grades;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		// < 단, 점수는 반드시 0 이상의 값이어야 함. > 이라는 문구가 있던데, 밑의 방식대로 하는 게 아닌 다른 방법이 있나?
		
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
		
		System.out.println("\n점수 : " + score + "\n학점 : " + grades);
		sc.close();
		
		// 이대로 하면 입력 값이 100을 넘거나 음수일 때 ㅡ 입력값이 엉터리일 때 불만족스러운 결과가 나옴. 사용자한테 특정값을 강요하고 싶음.
		
	}
	
	
	
}
