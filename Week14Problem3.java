import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Week14Problem3 {
	public static void main(String[] args) {
		char[][] board1 = {
				{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'} };

		char[][] board2 = {
				{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'} };

		System.out.println("Input board1=");
        printBoard(board1);
        System.out.println("Output= " + isValidSudoku(board1));

        System.out.println("\nInput board2=");
        printBoard(board2);
        System.out.println("Output= " + isValidSudoku(board2));
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			if (!isValidRow(board, i) || !isValidColumn(board, i)) {
				return false;
				}
			}
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				if (!isValidSubBox(board, i, j)) {
					return false;
					}
				}
			} return true;
		}
	
	private static boolean isValidRow(char[][] board, int row) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			char current = board[row][i];
			if (current != '.' && !set.add(current)) {
				return false;
				}
			} return true;
		}
	
	private static boolean isValidColumn(char[][] board, int col) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			char current = board[i][col];
			if (current != '.' && !set.add(current)) {
				return false;
				}
			} return true;
		}

	private static boolean isValidSubBox(char[][] board, int startRow, int startCol) {
		Set<Character> set = new HashSet<>();
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				char current = board[i][j];
				if (current != '.' && !set.add(current)) {
					return false;
					}
				}
			} return true;
		}
	}
