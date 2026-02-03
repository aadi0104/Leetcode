package LeetCode;

public class Edit_Distance_72 {

	public static void main(String[] args) {
		String word1 = "horse";
		String word2 = "ros";
		int[][] dp = new int[word1.length() + 1][word2.length() + 1];
		int ans = Edit_Distance(word1, word2, 0, 0, dp);
		System.out.print(ans);
	}

	public static int Edit_Distance(String word1, String word2, int i, int j, int[][] dp) {
		if (j == word2.length()) {
			return word1.length() - i;
		}
		if (i == word1.length()) {
			return word2.length() - j;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		if (word1.charAt(i) == word2.charAt(j)) {
			return dp[i][j] = Edit_Distance(word1, word2, i + 1, j + 1, dp);
		} else {
			int del = Edit_Distance(word1, word2, i + 1, j, dp);
			int ins = Edit_Distance(word1, word2, i, j + 1, dp);
			int rep = Edit_Distance(word1, word2, i + 1, j + 1, dp);
			return dp[i][j] = Math.min(del, Math.min(ins, rep)) + 1;
		}
	}

}