
public class Teacher extends Person {

	private String TeacherID;
	private int monthSalary;
	private int workedYear;
	
	
	public String getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(String teacherID) {
		TeacherID = teacherID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	
	
	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedYear) {
		super(name, age, height, weight);
		TeacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	public void show() {
		System.out.println("~~~~~~~~~~~~");
		System.out.println("���� �̸� : " + getName());
		System.out.println("���� ���� : " + getAge());
		System.out.println("���� Ű : " + getHeight());
		System.out.println("���� ������ : " + getWeight());
		System.out.println("������ ��ȣ : " + getTeacherID());
		System.out.println("���� ���� : " + getMonthSalary());
		System.out.println("���� ���� : " + getWorkedYear());
		
	}
	
}
