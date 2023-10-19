import java.util.Scanner;

public class Week7Problem2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int MIN = 0;
		final int MAX = 1000;
	
		System.out.printf("Give me first number: ");
		int numA = in.nextInt();
		while (numA < MIN || numA > MAX) {
			System.out.println("Invalid number. Please give another number");
			System.out.printf("Give me first number: ");
			numA = in.nextInt();
		}
		
		System.out.printf("Give me second number: ");
		int numB = in.nextInt();
		while (numB < MIN || numB > MAX) {
			System.out.println("Invalid number. Please give another number");
			System.out.printf("Give me second number: ");
			numB = in.nextInt();
		}
		
		int GCD = 0;
		
			
		for (int i = numA; i >= 0; i--) {
			if (numA%i == 0 && numB%i == 0) {
				GCD = i;
				System.out.println("Input: " + numA + "," + numB);
				System.out.println("Output: GCD(" + numA + "," + numB + ") = " + GCD);		
				break;
			}
			else if (numA < 0 || numA > 1000 || numB < 0 || numB > 1000) {
				System.out.print("Invalid numbers. Please try again");
				break;
				}
		}
		
		
		in.close();
	}
}
