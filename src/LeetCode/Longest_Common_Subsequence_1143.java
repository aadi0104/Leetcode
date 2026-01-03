package LeetCode;

import java.util.Arrays;

public class Longest_Common_Subsequence_1143 {

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace";
		int[][] dp = new int[text2.length()][text1.length()];
		for(int[] a: dp) {
			Arrays.fill(a, -1);
		}
		int ans = Longest_Common_Subsequence(text1, text2, 0, 0, dp);
		System.out.println(ans);
	}

	public static int Longest_Common_Subsequence(String text1, String text2, int i, int j, int[][] dp) {
		if (i == text1.length() || j == text2.length()) {
			return 0;
		}
		if (dp[j][i] != -1) {
			return dp[j][i];
		}
		if (text1.charAt(i) == text2.charAt(j)) {
			return dp[j][i] = 1 + Longest_Common_Subsequence(text1, text2, i + 1, j + 1, dp);
		} else {
			int s1 = Longest_Common_Subsequence(text1, text2, i + 1, j, dp);
			int s2 = Longest_Common_Subsequence(text1, text2, i, j + 1, dp);
			return dp[j][i] = Math.max(s1, s2);
		}
	}
}