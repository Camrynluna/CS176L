import java.util.Scanner;

public class Week6Problem1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter Name Here: ");
		String name = in.next();
		
		while (name == name) {
			System.out.println(name);
		}
		in.close();
	}
}
