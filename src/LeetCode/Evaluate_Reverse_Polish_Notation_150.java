package LeetCode;

import java.util.*;

public class Evaluate_Reverse_Polish_Notation_150 {

	public static void main(String[] args) {
		String[] tokens = { "2", "1", "+", "3", "*" };
		int ans = Evaluate_Reverse_Polish_Notation(tokens);
		System.out.print(ans);
	}

	public static int Evaluate_Reverse_Polish_Notation(String[] tokens) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < tokens.length; i++) {
			String exp = tokens[i];
			if (exp.equals("+")) {
				int y = st.pop();
				int x = st.pop();
				st.push(x + y);
			} else if (exp.equals("-")) {
				int y = st.pop();
				int x = st.pop();
				st.push(x - y);
			} else if (exp.equals("*")) {
				int y = st.pop();
				int x = st.pop();
				st.push(x * y);
			} else if (exp.equals("/")) {
				int y = st.pop();
				int x = st.pop();
				st.push(x / y);

			} else {
				st.push(Integer.parseInt(exp));
			}
		}
		return st.pop();
	}
	
}
