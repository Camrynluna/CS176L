package cs176lProblem;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Week14firstProblem {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            if (!file.exists()) {
                System.out.println("File not found: numbers.txt");
                return;
            }

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    try {
                        int number = Integer.parseInt(line);
                        if (number > 0) {
                            throw new Exception("Positive number found: " + number);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error! Invalid number format in line: " + line);
                    }
                }
            }

            System.out.println("No positive numbers were found!");
        } catch (IOException e) {
            System.out.println("Error! Can't read file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error! Exception: " + e.getMessage());
        }
    }
}

class PositiveNumException extends Exception {
    private static final long serialVersionUID = 1L;

   public PositiveNumException(String message) {
      super(message);
  }
}
