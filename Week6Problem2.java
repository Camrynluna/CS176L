import java.util.Scanner;

public class Week6Problem2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("What is your name?: ");
		String name = in.nextLine();
		
		System.out.printf("Hello " + name + ", how many exams have you taken?: ");
		int num = in.nextInt();
		
		int score = 1;
		double totalScore = 0;
		
		while (score <= num) {
			System.out.printf("Give me the score of exam " + score + ": ");
			double N1 = in.nextInt();
			if (N1 >=0 && N1 <= 100) {
				score = score + 1;
			}
			else if (N1 <= 0 || N1 > 100) {
			System.out.println("Invalid score! Please give me the score of exam " + score + ": ");
			}

			totalScore = totalScore + N1;
		}
		
		
		double avg = totalScore / num;
		
		System.out.printf("Hi, " + name + ", your average score of " + num + " exams is " + avg);
		
		in.close();
	}

}
