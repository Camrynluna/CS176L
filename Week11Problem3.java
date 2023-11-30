import java.util.Arrays;


public class Week11Problem3 {
	
	public static String rearrangeTheString(String input) {
		StringBuilder alphabet = new StringBuilder();
		int num = 0;

		for (char a : input.toCharArray()) {
			if (Character.isAlphabetic(a)) {
				alphabet.append(a);
				} 
			else if (Character.isDigit(a)) {
				num += Character.getNumericValue(a);
				}
			}

		char[] AlphabetSorted = alphabet.toString().toCharArray();
		Arrays.sort(AlphabetSorted);
		return new String(AlphabetSorted) + num;
		}

	public static void main(String[] args) {
		String input = "AC2BEW3";
		String output = rearrangeTheString(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
		}
}
