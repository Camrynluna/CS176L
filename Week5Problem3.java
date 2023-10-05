import java.util.Scanner;

public class Week5Problem3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter a String Value: ");
		String s = in.nextLine();
	
		if (s.charAt(0) == '0') {
			String sChange = s.substring(1);
			System.out.printf("Zero" + sChange);
		}
		else if (s.charAt(0) == '1') {
			String sChange = s.substring(1);
			System.out.printf("One" + sChange);
		}
		else if (s.charAt(0) == '2') {
			String sChange = s.substring(1);
			System.out.printf("Two" + sChange);
		}
		else if (s.charAt(0) == '3') {
			String sChange = s.substring(1);
			System.out.printf("Three" + sChange);
		}
		else if (s.charAt(0) == '4') {
			String sChange = s.substring(1);
			System.out.printf("Four" + sChange);
		}
		else if (s.charAt(0) == '5') {
			String sChange = s.substring(1);
			System.out.printf("Five" + sChange);
		}
		else if (s.charAt(0) == '6') {
			String sChange = s.substring(1);
			System.out.printf("Six" + sChange);
		}
		else if (s.charAt(0) == '7') {
			String sChange = s.substring(1);
			System.out.printf("Seven" + sChange);
		}
		else if (s.charAt(0) == '8') {
			String sChange = s.substring(1);
			System.out.printf("Eight" + sChange);
		}
		else if (s.charAt(0) == '9') {
			String sChange = s.substring(1);
			System.out.printf("Nine" + sChange);
		}
		else {
			System.out.printf("Invalid String");
		}
	in.close();
	}

}
