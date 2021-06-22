import java.util.Scanner;

//기능제공용
public class comLoopForWhile {

	public void printStar1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력(양수로) : ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			for(int i = 1; i <=num; i++) {	// 밑에 있는 j for문에서 (j < i)값을 성립시키기 위해 초기 i값은 1로 설정하고 범위는 <가 아닌 <=로 적용.
				System.out.println(i);
				for(int j = 0; j < i; j++) {
					if(i == num) {
						break;		// 브레이크를 걸지 않을 시 j는 i의 값을 따라 잡을 수 없으므로 계속해서 커져 나간다.
									// 원하는 목표 지점은 지정 정수 값ㅡㅡ num이므로 (i == num)라는 조건부를 건 것.
					}
					System.out.print("*");
				}
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
		
		sc.close();
	}
	
	public void printStar2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 0; i < num; i++) {		// i값이 num의 값보다 작을 때 i는 계속해서 커진다. (전체적 반복 횟수, 즉 세로 축의 길이를 의미. 이때는 num가 총 반복 횟수에 해당한다.)
				for(int j = 0; j <= i; j++) {	// j값이 i값보다 작거나 같으면 j는 계속해서 커진다. (세로축 내부의 반복 횟수를 의미)
					System.out.print("*");	// ex) 초기에는 j = 0인데 i = 0이다. 이때 j가 i와 같거나 그보다 작은 게 성립하려면 j값이 커질 필요 없이 그댈 멈추면 된다.
				}							//		한 번 반복했으면 다음은 j = 0이고 i = 1에서 시작한다. j값은 0이었다가 커져서 1이 되어 횟수는 2가 된다.
											//		이런 식으로 j는 0, 1, 2, ... 계속 커지다가 i값이 num값에 도달하는 시점에 함께 멈춘다. (서버가 끊겼는데 게임이 돌아갈 수는 없다.)
				System.out.println();		// 이는 j for문이 임무를 완수했을 때 다음 줄로 넘겨 주기 위함.(i for문에 걸려 있다.)
			}
			
		} else if(num < 0) {				// 음수로 시작한다.
			for(int i = 0; i > num; i--) {	// 초기 i를 0으로 둘 시, num값이 음수이기 때문에 부등호나 반복 사인은 통상의 반대.
				for(int k = 0; k > i; k--) { // 초기에는 i = k일지 모르나, 두 번째부터는 i는 커진 숫자로, k는 0부터 시작이므로 이 범위가 성립.
					System.out.print(" ");	// 따라서 처음은 출력되지 아니하고, 두 번째부터 왼쪽에서 출력되기 시작한다.
				}							// println이 아닌 print이므로 여기서 출력된 값에 후속이 이어서 첨가될 수 있다.
				for(int j = num; j < i; j++) {	// 추가되는 것은 *. *의 최대(초기) 갯수는 num로 지정하고, 횟수는 i를 따라잡을 때까지.
					System.out.print("*");
				}
				System.out.println();		// 여기까지가 가장 큰 for문의 끝.
			}
		} else {	// 앞서 나온 두 if문은 각각 양수 음수를 다루므로 그 나머지라고 하면 0밖에 없다.
			System.out.println("출력 기능이 없습니다.");
		}
		
		sc.close();
	}
	
	public void selectMenu() {
		
		// 미완성

		String[] menu = new String[9];
		
		String[] hamburger = {"햄버거", "불고기버거", "치킨버거"};
		String[] side = {"추가", "감자튀김", "치즈스틱", "샐러드"};
		String[] drink = {"음료수", "콜라", "에이드", "커피"};
		
		menu[0] = null;
		menu[1] = hamburger[1];
		menu[2] = hamburger[2];
		
		menu[3] = side[1];
		menu[4] = side[2];
		menu[5] = side[3];
		
		menu[6] = drink[1];
		menu[7] = drink[2];
		menu[8] = drink[3];
		
		int[] price = new int[9];	// 이럴 게 아니라 위에 menu[]에 가격을 대입해야 할 거 같은데.
		price[0] = 0;
		price[1] = 3500;
		price[2] = 3200;
		price[3] = 1000;	// 중복 발생
		price[4] = 400;
		price[5] = 2000;
		price[6] = 700;
		price[7] = 1200;
		price[8] = 1000;	// 중복 발생	// 일부러. 밑에 priceResult에 대입하려고
				
		System.out.println("*** 메뉴를 선택하세요 ***");
		
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
		System.out.print("메뉴 선택 : ");
		int number = sc.nextInt();
		
		String result = null;
		int priceResult = 0;
		
		for(int i = 1; i <= number; i++) {
			if(number == i) {
				result = menu[i];
				priceResult = price[i];
				System.out.println(result + "를 선택하셨습니다.");
			}
		}
		
		System.out.print("\n수량은 ? ");
		int Count = sc.nextInt();
		System.out.println(Count + "개 주문 하셨습니다.");
		
		
		System.out.print("\n추가 주문하시겠습니까?(y/n) : ");
		String Answer = sc.next();
		
		if(Answer.equals("y") || Answer.equals("Y")) {
			System.out.println("구상 중");
		} else if(Answer.equals ("n") || Answer.equals("N")) {
			System.out.println("주문하신 정보는 다음과 같습니다.");
			System.out.println("-----------------------------------------------");
			System.out.println(result + " : " + Count + "개" + " - " +  priceResult * Count + "원");
		} else {
			System.out.println("y와 n, 둘 중 하나만으로 다시 입력해 주세요.");
		}
		
		sc.close();
		
	}
	
	public void countInputCharacter() {
		
		// 미완성 else 부분. >>>>>>>>> Test2 파일에서 풀었음 ㅅㄱ.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		System.out.print("문자 입력 : ");		// 영문자가 아닐 경우 이게 출력 안 되게 하려면 어떡하지?
		char cha = sc.next().charAt(0);		// for문이나 if문 안으로 넣으면 오히려 반복이 많아지는데
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {	// 반복 횟수는 문자열로 입력된 글자의 갯수만큼
			if(str.charAt(i) >= 0x41 && str.charAt(i) <=0x7A) {	// 문자열 str에 포함된 글자 하나하나를 영 대문자인지 소문자인지 확인하는 것
				if(cha == str.charAt(i)) {	// 위에서 입력된 문자 하나가 문자열 str에서 지정된 하나와 같을 경우,
				count++;					// countㅡㅡ 갯수를 늘린다.
				}
			}
			else {	// 위에서 서술된 모든 게 아닐 경우 밑에 항목을 출력.
				System.out.println("영문자가 아닙니다.");
				break;
			}
			
		} 
		
		System.out.println("포함된 갯수 : " + count + "개");
		sc.close();
		
		
	}
	
}
