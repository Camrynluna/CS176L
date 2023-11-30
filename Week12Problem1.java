import java.util.Scanner;
import java.util.Random;

public class Week12Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = {"cheese", "caramel", "apple", "pomegranate", "orange", "chocolate", "peach", "blueberry", "strawberry"};
		String wordsToGuess = chooseWord(words);
		char[] guessedLetters = new char[wordsToGuess.length()];
		int attempts = 6;
        
        System.out.println("Hint: Type of food");
        while (true) {
        	System.out.println("You have " + attempts + " attempts left.");
        	showWord(wordsToGuess, guessedLetters);
        	char guess = getGuess(scanner);

        	if (alreadyGuessed(guess, guessedLetters)) {
        		System.out.println("You have already guessed that letter! Please try again.");
        		System.out.println(" ");
        		continue;
        		}

        	updateGuessedLetters(guess, wordsToGuess, guessedLetters);

        	if (!containsLetter(guess, wordsToGuess)) {
        		attempts--;
        		System.out.println("Incorrect guess! Try again.");
        		System.out.println(" ");
        		}
        	if (isWordGuessed(guessedLetters)) {
        		System.out.println("Congratulations! You guessed the right word!: " + wordsToGuess);
        		break;
        		}
        	if (attempts == 0) {
        		System.out.println("Game over! The word was: " + wordsToGuess);
        		break;
        		}
        	}
        }

	private static String chooseWord(String[] words) {
		Random random = new Random();
		return words[random.nextInt(words.length)];
		}
	
	private static void showWord(String word, char[] guessedLetters) {
		for (int i = 0; i < word.length(); i++) {
			char displayChar = guessedLetters[i] == '\0' ? '_' : guessedLetters[i];
			System.out.print(displayChar + " ");
			}
		System.out.println(" ");
		}
	
	private static char getGuess(Scanner scanner) {
		System.out.print("Type in your guess: ");
		return scanner.next().toLowerCase().charAt(0);
		}
	
	private static boolean alreadyGuessed(char guess, char[] guessedLetters) {
		for (int i = 0; i < guessedLetters.length; i++) {
			if (guessedLetters[i] == guess) {
				return true;
				}
			}
		return false;
		}

	private static boolean containsLetter(char guess, String word) {
		return word.indexOf(guess) != -1;
		}

	private static void updateGuessedLetters(char guess, String word, char[] guessedLetters) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess) {
				guessedLetters[i] = guess;
				} 
		}
	}
	
	private static boolean isWordGuessed(char[] guessedLetters) {
		for (char letter : guessedLetters) {
			if (letter == '\0') {
				return false;
				}
			}
		return true;
		}
}