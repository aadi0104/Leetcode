package LeetCode;

public class Island_Perimeter_463 {

	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int ans = Island_Perimeter(grid);
		System.out.print(ans);
	}

	public static int Island_Perimeter(int[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					return BFS(grid, i, j, visited);
				}
			}
		}
		return 1;
	}

	public static int BFS(int[][] grid, int row, int col, boolean[][] visited) {
		if (row < 0 || col < 0 || row == grid.length || col == grid[0].length || grid[row][col] == 0) {
			return 1;
		}
		if (!visited[row][col]) {
			visited[row][col] = true;
			return BFS(grid, row - 1, col, visited) + BFS(grid, row, col - 1, visited)
					+ BFS(grid, row + 1, col, visited) + BFS(grid, row, col + 1, visited);
		}
		return 0;
	}

}
