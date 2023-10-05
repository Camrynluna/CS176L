import java.util.Scanner;

public class Week5Problem2 {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.printf("Input an integer: ");
	int n1 = in.nextInt();
	
	System.out.printf("Input an operator(+,-,*,/): ");
	String opt = in.next();
	
	System.out.printf("Input another integer: ");
	int m1 = in.nextInt();
	
	if (opt.equals("+")) {
		int add;
		add = (n1 + m1);
		System.out.print(add);
	}
	else if (opt.equals("-")) {
		int subtract;
		subtract = (n1 - m1);
		System.out.print(subtract);
	}
	else if (opt.equals("*")) {
		int multiply;
		multiply = (n1 * m1);
		System.out.print(multiply);
	}
	else if (opt.equals("/")) {
		int divide;
		divide = (n1 / m1);
		System.out.print(divide);
	}
	else {
		System.out.printf("Operator Invalid!");
	}
	
	in.close();
	}

}
