import java.util.Scanner;

public class Week9Problem1 {
	
	
	public static void main(String[] args) {
		Scanner group = new Scanner(System.in);
		System.out.print("Enter the amount for your array: ");
		int len = group.nextInt();
		int[] num = new int [len];
		
		Scanner ints = new Scanner(System.in);
		System.out.println("Please input " + num.length + " integer numbers");
		
		for(int i=0; i<len; i++) {
			System.out.print("Index " + i + ": Input: ");
			num[i] = group.nextInt();
		}
		
		System.out.println("Reverse Array: ");
		for(int i=len-1; i>=0; i--) {
			System.out.println("Reverse[" + i + "]= Output: " + num[i]);
		}
		group.close();
		ints.close();
	}	
}
