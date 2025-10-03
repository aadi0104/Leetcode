package LeetCode;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_931 {

	public static void main(String[] args) {
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] arr : dp) {
			Arrays.fill(arr, Integer.MAX_VALUE);
		}
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Minimum_Falling_Path_Sum(matrix, 0, i, dp));
		}
		System.out.print(ans);
	}

	public static int Minimum_Falling_Path_Sum(int[][] matrix, int r, int c, int[][] dp) {
		if (c < 0 || c >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (r == matrix.length - 1) {
			return matrix[r][c];
		}
		if(dp[r][c] != Integer.MAX_VALUE) {
			return dp[r][c];
		}
		int leftdiagonal = Minimum_Falling_Path_Sum(matrix, r + 1, c - 1, dp);
		int rightdiagonal = Minimum_Falling_Path_Sum(matrix, r + 1, c + 1, dp);
		int bottom = Minimum_Falling_Path_Sum(matrix, r + 1, c, dp);
		return dp[r][c] = matrix[r][c] + Math.min(Math.min(rightdiagonal, leftdiagonal), bottom);
	}
}
