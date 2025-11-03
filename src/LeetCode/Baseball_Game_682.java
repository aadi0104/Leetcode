package LeetCode;

import java.util.*;

public class Baseball_Game_682 {

	public static void main(String[] args) {
		String[] operations = { "5", "2", "C", "D", "+" };
		int ans = Baseball_Game(operations);
		System.out.print(ans);
	}

	public static int Baseball_Game(String[] ops) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ops.length; i++) {
			String s = ops[i];
			if (!s.equals("C") && !s.equals("D") && !s.equals("+")) {
				st.push(Integer.parseInt(s));
			} else {
				if (s.equals("C")) {
					st.pop();
				} else if (s.equals("D")) {
					int x = st.peek();
					st.push(x * 2);
				} else {
					int a = st.pop();
					int b = st.peek();
					st.push(a);
					st.push(a + b);
				}
			}
		}
		int sum = 0;
		for (int v : st) {
			sum += v;
		}
		return sum;
	}


}
