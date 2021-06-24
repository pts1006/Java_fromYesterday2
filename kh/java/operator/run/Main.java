package kh.java.operator.run;

import java.util.Scanner;

public class Main {
	
	public void opSample1() {
		
		// 국 영 수 점수 입력 받고 총점과 평균으로 합격 불합격 판별.
		
		int Language = 0;
		int English = 0;
		int Mathematics = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Language : ");
		Language = sc.nextInt();
		
		System.out.print("English : ");
		English = sc.nextInt();
		
		System.out.print("Mathematics : ");
		Mathematics = sc.nextInt();
		
		int Score = Language + English + Mathematics;
		double Average = Score / 3;
		
		if(Language >= 40 && English >= 40 && Mathematics >= 40 && Average >= 60) {
			System.out.println("You pass.");
		} else {
			System.out.println("You fail.");
		}

		sc.close();
		
	}
	
	public void opSample2() {
		
		//학생 정보 입력 받고 출력 하기.
		//보류  >>>>>>>> Test2 파일에서 풀었음 ㅅㄱ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int StudentClass = sc.nextInt();
		
		System.out.print("번호 : ");
		int StudentNumber = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		for(int i = 0; i < 1; i++) {
			
			if(gender == "M") {	// 이 부분이 안 됨.
				System.out.println("남학생");	// 문제 1. "m"이나 "M"이나 "남" 등 성별을 알 수 있는 값을 입력 받으면 "남학생"이라는 글자가 출력되게 하고 싶은데, 입력 받은 값을 그대로 출력해버림.
			} else if (gender == "W") {
				System.out.println("여학생");
			} else {
				System.out.println("다시"); // 문제 2. 남학생 지정값도 여학생 지정값도 아닌 다른 값을 입력했을 때 나오게 하고 싶은데, 아무 때나 다 튀어 나옴.
				continue;
			}
		}
		
		System.out.print("성적 : ");
		double grades = sc.nextDouble();
		
		System.out.println(grade + "학년 " + StudentClass + "반 " + StudentNumber + "번 " + gender.charAt(0) + " " + name  + "은 " +  grades + "이다.");
		
		sc.close();
		
		
	}
	
	public void opSample3() {
		
		// 양수 음수 판별 문제.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
		
		if(number > 0) {	// 0 보다 크면 양수.
			System.out.println("양수다.");
		} else if(number < 0) {	// 0보다 작으면 음수. 즉 양수가 아니다.
			System.out.println("양수가 아니다.");
		} else {
			System.out.println("0은 양수도 음수도 아닌, 원점의 개념이다.");
		}
		// 원래는 number > 0 다음 else로 묶어서 '0보다 작으면 양수가 아니다'로 끝나는 부분인데
		// 그렇게 되면 '0' 또한 '양수가 아니다'로 묶여서, else if도 써 볼겸 수정해 봄.
		
		sc.close();
			
	}

	public void opSample4() {
		
		// 홀짝 판별 문제.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
		
		String str = null;	// 문제 요구 사항.
		
		if(number % 2 == 0) {	// 2로 나눴을 때 아무것도 남지 않으면 짝수. (0도 짝수다.)
			str = "짝수다.";
		} else {				// 그 반대는 홀수.
			str = "홀수다.";
		}
		
		System.out.println(str);
		sc.close();
		
	}
	
	public static void main(String[] args) {
		

		
	}
}
