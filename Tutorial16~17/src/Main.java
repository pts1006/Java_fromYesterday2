import java.util.Scanner;

/*
	���
	: �ٸ� Ŭ������ ������ �ִ� ������ �ڽ��� �����ϰڴٴ� �ǹ�.
	 "�ν��Ͻ�ȭ"�ʹ� �ٸ� �ǹ�. �� ����.
	 "�ν��Ͻ�" : � Ŭ�����κ��� ������� ��ü�� �� Ŭ������ �ν��Ͻ��� �Ѵ�. = ��ü.
	 
	 	1. �ϳ��� ����� �ǹ��ϴ� Person "Ŭ����"�� �����Ѵ�.
	 	
	 	2. Person�� ��� �޾� �ϳ��� �л��� �ǹ��ϴ� Student Ŭ������ ����.
	 	
	 	3. Student Ŭ������ �̿��Ͽ� ��ü�� ����.
*/
public class Main {

	public static void main(String[] args) {
/*		

		Student student1 =new Student("putus", 20, 175, 70 ,"20210123", 1, 4.5);
		// Person Ŭ������ ��� ���� Student Ŭ������ �л� �ν��Ͻ� ���� ����� ��.
		Student student2 =new Student("�̼���", 30, 170, 80 ,"20090123", 4, 3.0);
		
		student1.show();
		student2.show();
		
// 17��. ��� 2 ���� === ���� �����.
		
		Teacher teacher1 = new Teacher("putus", 20, 175, 70, "20210124", 200, 1);
		
		teacher1.show();
		
		
*/	// ��������� 17�� �� �κ�. ���ݺ��ʹ� ��ȭ �н�.
		
		// �迭�� for���� �̿��� ���� ���� �������� ����.

/*		

		Student[] students = new Student[30];
		for(int i = 0; i < 30; i++) {
			students[i] = new Student("ȫ�浿", 20, 175, 70, i + "", 1, 4.5); // �й��� �ٸ��� ���. �׷��� i�� �������̱� ������ �й�(���ڿ�)�� ���İ� �ٸ�. �׷���  < i + ""> �� �� �༭ ���ڿ��� ����� ��.
			students[i].show();
		}
		
		
*/	// ������ ���� ����ڷκ��� �Է� �����͸� �޾Ƽ� �л� ������ �����ϰ� ����ϴ� ���.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� �����մϱ�? ");
		
		int number = scan.nextInt();	// ����ڰ� �Է��� �ϳ��� ������ ���� �޾Ƽ� number�� ��� ��.
		
		Student[] students = new Student[number];
		
		for(int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = scan.next();	// ���ó�� nextInt�δ�, �� �� ����. �̸��� ������ �ƴϴϱ�. ��ó�� �׳� next�� �� �ָ� ��. nextString ����.
			
			System.out.print("�л��� ���̸� �Է��ϼ��� : ");
			age = scan.nextInt();
			
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = scan.nextInt();
			
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight = scan.nextInt();
			
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentID = scan.next();
			
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade = scan.nextInt();
			
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA = scan.nextDouble();
			
			//�Լ��� ȣ���� �� new�� ���̸� ���ο� ��ü�� ���� �Ŀ� �̸� �����Ѵ�.
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA); // �ݺ����̴ϱ� ���⼭ �� �� �ʱ�ȭ. ���� ó���� �Է���, �л����� ���ڰ� ��ŭ �迭�� ��� ������ ���ҵ��� �ʱ�ȭ�� ��� �ϱ� ������ �� �׷��� ���� �л� ������ �Է��ϴϱ� ��  students[i] = new �� ����. 
		}
		
		for(int i = 0; i < number; i++) {
			students[i].show();
		} // �̷��� �ϸ� Student Ŭ������ �Է��� public void show() {}���� �߰�ȣ ���� �͵��� ���� ��� ��.
		scan.close();	// �ݱ�.
	}

}
