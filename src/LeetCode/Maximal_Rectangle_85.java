package LeetCode;

import java.util.*;

public class Maximal_Rectangle_85 {

	public static void main(String[] args) {
		char[][] matrix = { { '0', '1' }, { '1', '0' } };
		int ans = Maximal_Rectangle(matrix);
		System.out.print(ans);
	}

	public static int Maximal_Rectangle(char[][] matrix) {
		int[] arr = new int[matrix[0].length];
		int ans = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '1') {
					arr[j]++;
				} else {
					arr[j] = 0;
				}
			}
			ans = Math.max(ans, Largest_Area(arr));
		}
		return ans;
	}

	public static int Largest_Area(int[] heights) {
		int ans = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < heights.length; i++) {
			while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
				int h = heights[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					ans = Math.max(ans, h * r);
				} else {
					int l = st.peek();
					ans = Math.max(ans, h * (r - l - 1));
				}
			}
			st.push(i);
		}
		int r = heights.length;
		while (!st.isEmpty()) {
			int h = heights[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * r);
			} else {
				int l = st.peek();
				ans = Math.max(ans, h * (r - l - 1));
			}
		}
		return ans;
	}
	
}
