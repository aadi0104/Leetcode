package LeetCode;

public class Unique_Paths_62 {

	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		int[][] dp = new int[m + 1][n + 1];
		int ans = Unique_Paths(m, n, 0, 0, dp);
		System.out.print(ans);
	}

	public static int Unique_Paths(int m, int n, int i, int j, int[][] dp) {
		if (i == m - 1 && j == n - 1) {
			return 1;
		}
		if (i >= m || j >= n) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int right = Unique_Paths(m, n, i, j + 1, dp);
		int down = Unique_Paths(m, n, i + 1, j, dp);
		return dp[i][j] = right + down;
	}
}