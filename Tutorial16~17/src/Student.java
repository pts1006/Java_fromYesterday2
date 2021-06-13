// extends x = x�� �����ϰڴ�. ��, x�� ����ϰڴ�.
public class Student extends Person {

	private String studentID;
	private int grade;
	private double GPA;
	
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	// ������ name, age, height, weight�� ���µ� ���ڱ� �� ����°�? �Ѥ�Person���� ��� �޾����ϱ�.
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight); // Person Ŭ���� ������� �����. �θ� Ŭ������ ���⼱ Person Ŭ������ �ǹ��ϴµ�, �װ��� �����ڸ� �����ϰڴٴ� �ǹ���.
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("----------------");
		System.out.println("�л� �̸� : " + getName());
		System.out.println("�л� ���� : " + getAge());
		System.out.println("�л� Ű : " + getHeight());
		System.out.println("�л� ������ : " + getWeight());
		System.out.println("�й� : " + getStudentID());
		System.out.println("�г� : " + getGrade());
		System.out.println("���� : " + getGPA());
	}
	
}
