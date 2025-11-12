package LeetCode;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II_1289 {

	public static void main(String[] args) {
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] arr : dp) {
			Arrays.fill(arr, Integer.MAX_VALUE);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Minimum_Falling_Path_Sum_II(grid, 0, i, dp));
		}
		System.out.print(ans);
	}

	public static int Minimum_Falling_Path_Sum_II(int[][] grid, int r, int c, int[][] dp) {
		if (r == grid.length - 1) {
			return grid[r][c];
		}
		if (dp[r][c] != Integer.MAX_VALUE) {
			return dp[r][c];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			if (i != c) {
				ans = Math.min(ans, Minimum_Falling_Path_Sum_II(grid, r + 1, i, dp));
			}
		}
		return dp[r][c] = grid[r][c] + ans;
	}

}
