
import java.util.Scanner;

public class Week8Problem2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Give me a String: ");
		String enter = in.nextLine();
		System.out.println("Your word: " + enter);
		for (int i = enter.length()-1; i >= 0; i--) {
			char a = enter.charAt(i);
			System.out.print(a);
		}
		
		in.close();
		
	}

}
