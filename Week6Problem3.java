import java.util.Scanner;

public class Week6Problem3 {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean num = true;
		
		while (num) {
			System.out.printf("Please give me a sentence: ");
			String sentence = in.nextLine();
			num = false;
		
			for (int m = 0; m < sentence.length(); m++) {
				char character = sentence.charAt(m);
				if (character >= '0' && character <= '9') {
					System.out.println(sentence + " contains numerical characters, please check it again.");
					num = true;
					break;
				}
			}
		
			if (!num) {
				System.out.println("No numerical characters.");
			}
		}
		in.close();
	}
}
