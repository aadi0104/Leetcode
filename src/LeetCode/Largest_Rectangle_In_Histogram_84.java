package LeetCode;

import java.util.*;

public class Largest_Rectangle_In_Histogram_84 {

	public static void main(String[] args) {
		int[] heights = { 2, 1, 5, 6, 2, 3 };
		int ans = Largest_Rectangle_In_Histogram(heights);
		System.out.print(ans);
	}

	public static int Largest_Rectangle_In_Histogram(int[] heights) {
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
