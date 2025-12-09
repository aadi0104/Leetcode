package LeetCode;

public class Sudoku_Solver_37 {

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		Sudoku_Solver(board, 0, 0);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean Sudoku_Solver(char[][] board, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			return true;
		}
		if (board[row][col] != '.') {
			return Sudoku_Solver(board, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (isSafe(board, row, col, val)) {
					board[row][col] = (char) (val + '0');
					boolean ans = Sudoku_Solver(board, row, col + 1);
					if (ans) {
						return ans;
					}
					board[row][col] = '.';
				}
			}
		}
		return false;
	}

	public static boolean isSafe(char[][] board, int row, int col, int val) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == (char) (val + '0')) {
				return false;
			}
		}
		for (int j = 0; j < board[0].length; j++) {
			if (board[row][j] == (char) (val + '0')) {
				return false;
			}
		}
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (board[i][j] == (char) (val + '0')) {
					return false;
				}
			}
		}
		return true;
	}
}
