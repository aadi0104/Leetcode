package LeetCode;

import java.util.*;

public class Distinct_Subsequences_115 {

	public static void main(String[] args) {
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		int ans = Distinct_Subsequences(s, t, 0, 0, dp);
		System.out.print(ans);
	}

	public static int Distinct_Subsequences(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int count = 0;
		if (s.charAt(i) == t.charAt(j)) {
			count += Distinct_Subsequences(s, t, i + 1, j + 1, dp);
		}
		count += Distinct_Subsequences(s, t, i + 1, j, dp);
		return dp[i][j] = count;
	}
	
}
