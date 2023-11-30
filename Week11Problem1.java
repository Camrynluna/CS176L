public class Week11Problem1 {
	
	public static String decimaltoRomanNumeral(int num) {
		int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		StringBuilder romanNum = new StringBuilder();
		int i = 0;

		while (num > 0) {
			int quo = num / number[i];
			for (int j = 0; j < quo; j++) {
				romanNum.append(rom[i]);
				num -= number[i];
				}i++;
			}
		return romanNum.toString();
		}

	public static void main(String[] args) {
		System.out.println("Input: 9 Output: " + decimaltoRomanNumeral(9));
		System.out.println("Input: 40 Output: " + decimaltoRomanNumeral(40));
		System.out.println("Input: 1904 Output: " + decimaltoRomanNumeral(1904));
		}
}
