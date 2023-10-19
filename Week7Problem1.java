import java.util.Scanner;

public class Week7Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter a String: ");
		String input = in.nextLine();
		
		if (IfPalindrome(input)) {
			System.out.println("The word is a Palindrome.");
		}
		else {
			System.out.println("The word is not a Palindrome.");
		}
		in.close();
	}
	
	public static boolean IfPalindrome(String input) {
		input = input.toLowerCase();
		input = input.replaceAll("[^a-z]", "");
		
		return input.equals(new StringBuilder(input).reverse().toString());
	}
}
