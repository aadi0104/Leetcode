package LeetCode;

public class Word_Search_79 {

	static boolean check = false;

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		int[][] check_board = new int[board.length][board[0].length];
		String word = "ABCB";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				Word_Search(board, word, i, j, "", check_board);
			}
		}
		System.out.print(check);
	}

	public static void Word_Search(char[][] board, String word, int cr, int cc, String ans, int[][] check_board) {
		if (ans.equals(word)) {
			check = true;
			return;
		}
		if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || check_board[cr][cc] == 1) {
			return;
		}
		if (!ans.equals(word.substring(0, ans.length()))) {
			return;
		}
		check_board[cr][cc] = 1;
		Word_Search(board, word, cr - 1, cc, ans + board[cr][cc], check_board); // Up
		Word_Search(board, word, cr, cc - 1, ans + board[cr][cc], check_board); // Left
		Word_Search(board, word, cr + 1, cc, ans + board[cr][cc], check_board); // Down
		Word_Search(board, word, cr, cc + 1, ans + board[cr][cc], check_board); // Right
		check_board[cr][cc] = 0;
	}

}
