package LeetCode;

import java.util.*;

public class Generate_Parantheses_22 {

	public static void main(String[] args) {
		int n = 3;
		List<String> s = new ArrayList<>();
		Generate_Parantheses(n, 0, 0, "", s);
		System.out.print(s);
	}

	public static void Generate_Parantheses(int n, int open, int closed, String ans, List<String> s) {
		if (open == n && closed == n) {
			s.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}
		Generate_Parantheses(n, open + 1, closed, ans + "(", s);
		Generate_Parantheses(n, open, closed + 1, ans + ")", s);
	}
	
}
