package LeetCode;

import java.util.*;

public class Longest_Valid_Parentheses_32 {

	public static void main(String[] args) {
		String s = ")()())";
		Stack<Integer> st = new Stack<>();
		int ans = Longest_Valid_Parentheses(s, 0, st, 0);
		System.out.print(ans);
	}

	public static int Longest_Valid_Parentheses(String s, int i, Stack<Integer> st, int maxLen) {
		if (i == s.length()) {
			return maxLen;
		}
		if (s.charAt(i) == '(') {
			st.push(i);
		} else {
			if (!st.isEmpty() && st.peek() != -1 && s.charAt(st.peek()) == '(') {
				st.pop();
				if (!st.isEmpty()) {
					maxLen = Math.max(maxLen, i - st.peek());
				} else {
					maxLen = Math.max(maxLen, i - (-1));
				}
			} else {
				st.push(i);
			}
		}
		return Longest_Valid_Parentheses(s, i + 1, st, maxLen);
	}
}