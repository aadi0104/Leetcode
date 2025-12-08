package LeetCode;

import java.util.*;

public class N_Queens_II_52 {

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		String dots = ".".repeat(n);
		List<String> temp = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		N_Queens_II(n, board, 0, dots, temp, ans);
		System.out.print(ans.size());
	}

	public static void N_Queens_II(int n, boolean[][] board, int row, String path, List<String> temp,
			List<List<String>> ans) {
		if (n == 0) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isSafe(board, row, col)) {
				board[row][col] = true;
				String x = Update_Path(path, 'Q', col);
				temp.add(x);
				N_Queens_II(n - 1, board, row + 1, path, temp, ans);
				temp.remove(temp.size() - 1);
				board[row][col] = false;
			}
		}
	}

	public static String Update_Path(String s, char x, int idx) {
		char[] ch = s.toCharArray();
		ch[idx] = x;
		String str = new String(ch);
		return str;
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {
//		Along Y-Axis:
		int r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
//		Left Diagonal:
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
//		Right Diagonal:
		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}
