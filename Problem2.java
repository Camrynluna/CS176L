
public class Problem2 {
	public static void main(String[] args) {
		Student studentX = new Student();

		studentX.set_Name("Camryn");
		studentX.add_quiz(70);
		studentX.add_quiz(72);
		studentX.add_quiz(99);
		studentX.add_quiz(87);
		studentX.add_quiz(88);
		
		studentX.Avg_quizScore();
		
		System.out.println(studentX.name);
		System.out.println(studentX.total_score);
		System.out.println(studentX.avg_score);
		
	}
}

	
class Student {
	
	String name;
	int total_score;
	int avg_score;
		
		
	public int get_score() {
		return total_score;
	}
	void add_quiz(int score) {
			total_score = total_score + score;
	}
	
	public int getAverageScore() {
		return avg_score;
	}
	void Avg_quizScore() {
		avg_score =  total_score / 5;
	}
	public String getName() {
		return name;
	}
	void set_Name(String myname) {
		name =  myname;
	}
}