package LeetCode;

public class Climbing_Stairs_70 {

	public static void main(String[] args) {
		int n = 3;
		int[] dp = new int[n + 1];
		int ans = Climbing_Stairs(n, 1, dp);
		System.out.print(ans);
	}

	public static int Climbing_Stairs(int n, int i, int[] dp) {
		if (i >= n) {
			return 1;
		}
		if (dp[i] != 0) {
			return dp[i];
		}
		int onestep = Climbing_Stairs(n, i + 1, dp);
		int twostep = Climbing_Stairs(n, i + 2, dp);
		return dp[i] = onestep + twostep;
	}
}
