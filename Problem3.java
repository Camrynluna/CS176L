
public class Problem3 {
	public static void main(String[] args) {
		University myUniversity = new University();

		myUniversity.set_Name("Welcome to Monmouth University!");
		myUniversity.student_percent(1652);
		myUniversity.student_percent(1569);
		myUniversity.student_percent(1547);
		myUniversity.student_percent(1390);
		
		System.out.println(myUniversity.name);
		System.out.println(myUniversity.total_score);
		
	}
}

	
class University {
	
	String name;
	int total_score;
	int avg_score;
		
	public int get_student_score() {
		return total_score;
	}
	void student_percent(int score) {
			total_score = total_score + score;
	}
	
	public String getName() {
		return name;
	}
	void set_Name(String myname) {
		name =  myname;
	}
}
