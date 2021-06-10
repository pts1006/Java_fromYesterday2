import java.util.Scanner;

/*
	배열
	: 데이터가 많을 때 그 많은 데이터들을 효과적으로 처리하고 저장하도록 해 주는 하나의 자료형.
	
		목표 : 배열을 적절히 사용하여 많은 데이터를 처리.
		
			1. 원하는 개수만큼의 배열 생성 및 최댓값 구하는 프로그램을 작성.
		
			2. 랜덤 정수 100개의 평균을 구하는 프로그램을 작성.

*/
public class Main {

	public static int max (int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = scanner.nextInt();
		
		int[] array = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 (양수) : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;		// -1 넣은 이유는 바로 위의 파란 글씨에서 배열에 입력할 수를 양수로 정의했기 때문. 밑의 for문에 있는 범위를 보면 알겠지만 결과 값이 음수가 나올 수 없음. 따라서 결과적으로 양수만 나오는 함수를 만들어 낼 수 있다.
		for (int i = 0; i < number; i++) {
			result = max(result, array[i]);
		}	// 예 ) 줄33에 result에 담기는 인수의 갯수가 5개이고 각각 7,8,9,10,11인 경우, 줄31의 result값인 -1과 비교해서 더 클 수밖에 없다. 이 경우 최종적으로 result값엔 11이 담기게 됨. (배열 중 최댓값을 구하려고 작성한 함수니까.)
		System.out.println("입력한 모든 정수 중에서 가장 큰 값은 : " + result + "입니다.");
		
		scanner.close();
	}
		// 모르겠으면 코드 직접 실행해 보기.
}
