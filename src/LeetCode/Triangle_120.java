package LeetCode;

import java.util.*;

public class Triangle_120 {

	public static void main(String[] args) {
//		int[][] triangle = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		List<List<Integer>> triangle = new ArrayList<>();
		int n = triangle.size();
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dp[i][j] = -1;
			}
		}
		int ans = Triangle(triangle, 0, 0, dp);
		System.out.print(ans);
	}

	public static int Triangle(List<List<Integer>> triangle, int i, int j, int[][] dp) {
		if (i == triangle.size() - 1) {
			return triangle.get(i).get(j);
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int first = Triangle(triangle, i + 1, j, dp);
		int second = Triangle(triangle, i + 1, j + 1, dp);
		return dp[i][j] = triangle.get(i).get(j) + Math.min(first, second);
	}
}