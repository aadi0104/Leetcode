package LeetCode;

import java.util.*;

public class Valid_Parentheses_20 {

	public static void main(String[] args) {
		String s = "([])";
		System.out.println(Valid_Parentheses(s));
	}

	public static boolean Valid_Parentheses(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				} else if (ch == ')' && st.peek() == '(') {
					st.pop();
				} else if (ch == '}' && st.peek() == '{') {
					st.pop();
				} else if (ch == ']' && st.peek() == '[') {
					st.pop();
				} else {
					return false;
				}
			}
		}
		if (st.isEmpty()) {
			return true;
		}
		return false;
	}
	
}
