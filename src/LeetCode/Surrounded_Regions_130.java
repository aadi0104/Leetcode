package LeetCode;

import java.util.*;

public class Surrounded_Regions_130 {

	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' } };

		Surrounded_Regions(board);
	}

	public static void Surrounded_Regions(char[][] board) {
		int n = board.length;
		int m = board[0].length;
		boolean[][] visited = new boolean[n][m];
		for (int col = 0; col < m; col++) {
			if (board[0][col] == 'O' && !visited[0][col]) {
				BFS(board, 0, col, visited);
			}
		}
		for (int col = 0; col < m; col++) {
			if (board[n - 1][col] == 'O' && !visited[n - 1][col]) {
				BFS(board, n - 1, col, visited);
			}
		}
		for (int row = 0; row < n; row++) {
			if (board[row][0] == 'O' && !visited[row][0]) {
				BFS(board, row, 0, visited);
			}
		}
		for (int row = 0; row < n; row++) {
			if (board[row][m - 1] == 'O' && !visited[row][m - 1]) {
				BFS(board, row, m - 1, visited);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (visited[i][j]) {
					board[i][j] = 'O';
				} else {
					board[i][j] = 'X';
				}
			}
		}
	}

	public static void BFS(char[][] board, int row, int col, boolean[][] visited) {
		Queue<RegionPair> q = new LinkedList<>();
		q.add(new RegionPair(row, col));
		while (!q.isEmpty()) {
			// 1. Remove
			RegionPair rp = q.poll();

			// 2. Ignore
			if (visited[rp.row][rp.col]) {
				continue;
			}

			// 3. Mark Visited
			visited[rp.row][rp.col] = true;

			// 4. Self Work

			// 5. Add NBRS
			int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
			for (int[] dir : directions) {
				int nrow = rp.row + dir[0];
				int ncol = rp.col + dir[1];
				if (nrow >= 0 && ncol >= 0 && nrow < board.length && ncol < board[0].length && !visited[nrow][ncol]
						&& board[nrow][ncol] == 'O') {
					q.add(new RegionPair(nrow, ncol));
				}
			}
		}
	}

}

class RegionPair {
	int row;
	int col;

	public RegionPair(int row, int col) {
		this.row = row;
		this.col = col;
	}

}
