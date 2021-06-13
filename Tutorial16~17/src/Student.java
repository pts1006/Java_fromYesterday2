// extends x = x를 포함하겠다. 즉, x를 상속하겠다.
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
	
	// 위에는 name, age, height, weight이 없는데 갑자기 왜 생겼는가? ㅡㅡPerson에서 상속 받았으니까.
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight); // Person 클래스 설명란에 썼었음. 부모 클래스ㅡ 여기선 Person 클래스를 의미하는데, 그곳의 실행자를 실행하겠다는 의미임.
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("----------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학생 몸무게 : " + getWeight());
		System.out.println("학번 : " + getStudentID());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGPA());
	}
	
}
