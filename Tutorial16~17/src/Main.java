import java.util.Scanner;

/*
	상속
	: 다른 클래스가 가지고 있는 정보를 자신이 포함하겠다는 의미.
	 "인스턴스화"와는 다른 의미. 밑 참고.
	 "인스턴스" : 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라 한다. = 객체.
	 
	 	1. 하나의 사람을 의미하는 Person "클래스"를 생성한다.
	 	
	 	2. Person을 상속 받아 하나의 학생을 의미하는 Student 클래스를 생성.
	 	
	 	3. Student 클래스를 이용하여 객체를 생성.
*/
public class Main {

	public static void main(String[] args) {
/*		

		Student student1 =new Student("putus", 20, 175, 70 ,"20210123", 1, 4.5);
		// Person 클래스를 상속 받은 Student 클래스로 학생 인스턴스 변수 만들어 줌.
		Student student2 =new Student("이순신", 30, 170, 80 ,"20090123", 4, 3.0);
		
		student1.show();
		student2.show();
		
// 17강. 상속 2 수업 === 선생 만들기.
		
		Teacher teacher1 = new Teacher("putus", 20, 175, 70, "20210124", 200, 1);
		
		teacher1.show();
		
		
*/	// 여기까지가 17강 앞 부분. 지금부터는 심화 학습.
		
		// 배열과 for문을 이용해 많은 양을 구성시켜 보자.

/*		

		Student[] students = new Student[30];
		for(int i = 0; i < 30; i++) {
			students[i] = new Student("홍길동", 20, 175, 70, i + "", 1, 4.5); // 학번만 다르게 출력. 그런데 i는 정수형이기 때문에 학번(문자열)의 형식과 다름. 그래서  < i + ""> 을 해 줘서 문자열로 만들어 줌.
			students[i].show();
		}
		
		
*/	// 이제는 실제 사용자로부터 입력 데이터를 받아서 학생 정보를 구축하고 출력하는 방법.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까? ");
		
		int number = scan.nextInt();	// 사용자가 입력한 하나의 정수를 돌려 받아서 number에 담는 것.
		
		Student[] students = new Student[number];
		
		for(int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();	// 평소처럼 nextInt로는, 할 수 없음. 이름이 정수가 아니니까. 이처럼 그냥 next만 써 주면 됨. nextString 없음.
			
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			
			//함수를 호출할 때 new를 붙이면 새로운 객체를 만든 후에 이를 리턴한다.
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA); // 반복문이니까 여기서 한 번 초기화. 또한 처음에 입력한, 학생들의 숫자값 만큼 배열에 담긴 각각의 원소들을 초기화해 줘야 하기 때문에 ㅡ 그래야 다음 학생 정보도 입력하니까 ㅡ  students[i] = new 가 붙음. 
		}
		
		for(int i = 0; i < number; i++) {
			students[i].show();
		} // 이렇게 하면 Student 클래스에 입력한 public void show() {}에서 중괄호 안의 것들이 최종 출력 됨.
		scan.close();	// 닫기.
	}

}
