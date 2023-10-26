
import java.util.Scanner;

public class Week8Problem1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Give me a String: ");
		String given = in.nextLine();
		
		if (Character.isWhitespace(' ')) {
			System.out.println("With Spaces: " + given);
			String NoSpace = given.replaceAll(" ", "");
			System.out.println("With no Spaces: " + NoSpace);
			}
		in.close();
	}

}
