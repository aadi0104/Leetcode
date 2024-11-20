package LeetCode;

import java.util.*;

public class Second_Largest_Digit_In_A_String_1796 {

	public static void main(String[] args) {
		String s = "dfa12321afd";
		int ans = Second_Largest_Digit_In_A_String(s);
		System.out.print(ans);
	}

	public static int Second_Largest_Digit_In_A_String(String s) {
		List<String> digitlist = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if (Is_Digit(s.charAt(i))) {
				String str = "";
				str += s.charAt(i);
				digitlist.add(str);
			}
		}
		Collections.sort(digitlist);
		if (digitlist.size() > 1) {
			return Find_Second_Largest(digitlist);
		} else {
			return -1;
		}
	}

	public static boolean Is_Digit(char ch) {
		String str = "0123456789";
		String s = "";
		s += ch;
		if (str.contains(s)) {
			return true;
		}
		return false;
	}

	public static int Find_Second_Largest(List<String> s) {
		String maxx = s.get(s.size() - 1);
		String secondmaxx = "-1";
		for (int i = s.size() - 1; i >= 0; i--) {
			if (Integer.parseInt(s.get(i)) < Integer.parseInt(maxx)) {
				secondmaxx = s.get(i);
				break;
			}
		}
		return Integer.parseInt(secondmaxx);
	}

}
