import java.util.Scanner;

public class Week5Problem1 {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.printf("Enter First Name: ");
	String name1 = in.nextLine();
	
	System.out.printf("Enter Second Name: ");
	String name2 = in.nextLine();
	
	if (name1.equals(name2)) {
		System.out.printf("Same Name!: " + name1);
	}
	else {
		System.out.printf(name1 + " and " + name2 + " are different!");
	}
	
	in.close();
	}

}
