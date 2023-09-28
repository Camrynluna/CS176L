
public class StudentGrade {
	private int grade;
	private String name;
	final int DEFAULT_GRADE = 60;
	final int MAXIMUMGRADE = 100;
	final int MINIMUMGRADE = 0;
	final int AGRADE = 90;
	final int BGRADE = 80;
	final int CGRADE = 70;

	public StudentGrade(String name) {
		this.grade = DEFAULT_GRADE;
	}
	public StudentGrade(String name, int grade) {
		setGrade(grade);
	}
	public void setGrade(int grade) {
		if (grade >= MINIMUMGRADE && grade <= MAXIMUMGRADE) {
			this.grade = grade;
		}
		else {
			this.grade = DEFAULT_GRADE;	
		}
	}
	public int getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public String getGradeLevel() {
		if (grade >= AGRADE) {
			return "A";
		}
		else if (grade >= BGRADE && grade < AGRADE) {
			return "B";
		}
		else if (grade >= CGRADE && grade < BGRADE) {
			return "C";
		}
		else {
			return "D";
		}
	}
	public static void main(String[] args) {
		StudentGrade tom = new StudentGrade("Tom");
		StudentGrade cam = new StudentGrade("Cam", 99);
		System.out.println(tom.getGrade());
		System.out.println(cam.getGrade());
		tom.setGrade(-100);
		System.out.println(tom.getGrade());
		tom.setGrade(1000);
		System.out.println(tom.getGrade());
		tom.setGrade(88);
		System.out.println(tom.getGrade());
		System.out.println(cam.getGradeLevel());
		System.out.println(tom.getGradeLevel());
		tom.setGrade(77);
		System.out.println(tom.getGradeLevel());
		tom.setGrade(54);
		System.out.println(tom.getGradeLevel());
		
	}
}
