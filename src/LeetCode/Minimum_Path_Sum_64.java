package LeetCode;

public class Minimum_Path_Sum_64 {

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		int ans = Minimum_Path_Sum(grid, 0, 0, dp);
		System.out.print(ans);
	}

	public static int Minimum_Path_Sum(int[][] grid, int i, int j, int[][] dp) {
		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return grid[i][j];
		}
		if (i == grid.length || j == grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int down = Minimum_Path_Sum(grid, i + 1, j, dp);
		int right = Minimum_Path_Sum(grid, i, j + 1, dp);
		return dp[i][j] = grid[i][j] + Math.min(down, right);
	}
}
