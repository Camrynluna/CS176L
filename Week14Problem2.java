import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Week14Problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a list of integers separated by spaces: ");

		try {
			String input = scanner.nextLine();
			String[] numbersAsString = input.split("\\s+");
			
			int[] numbers = new int[numbersAsString.length];
			
			for (int i = 0; i < numbersAsString.length; i++) {
				numbers[i] = Integer.parseInt(numbersAsString[i]);
				}
			
			checkForDuplicates(numbers);
			
			System.out.println("No duplicates were found.");
			} catch (NumberFormatException e) {
				System.out.println("Error. Invalid input. Please enter valid integers.");
				} catch (DuplicateNumberException e) {
					System.out.println("Error. Duplicate number found: " + e.getDuplicateNumber());
					} finally {
						scanner.close();
						}
		}
	
	private static void checkForDuplicates(int[] numbers) throws DuplicateNumberException {
		Set<Integer> uniqueNumbers = new HashSet<>();
		
		for (int number : numbers) {
			if (!uniqueNumbers.add(number)) {
				throw new DuplicateNumberException(number);
				}
			}
		}
	
	static class DuplicateNumberException extends Exception {
		private static final long serialVersionUID = 1L;
		private final int dupNumber;
		
		public DuplicateNumberException(int duplicateNumber) {
			this.dupNumber = duplicateNumber;
			}
		public int getDuplicateNumber() {
			return dupNumber;
			}
		}
	}
