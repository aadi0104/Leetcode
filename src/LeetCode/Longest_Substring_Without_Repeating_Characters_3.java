package LeetCode;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters_3 {

	public static void main(String[] args) {
		String s = "pwwkew";
		int ans = Longest_Substring_Without_Repeating_Characters(s);
		System.out.print(ans);
	}

	public static int Longest_Substring_Without_Repeating_Characters(String s) {
		int ans = 0;
		int st = 0;
		int en = 0;
		HashSet<Character> set = new HashSet<>();
		while (en < s.length()) {
            char currentChar = s.charAt(en);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(st));
                st++;
            }
            set.add(currentChar);
            ans = Math.max(ans, en - st + 1);
            en++;
        }
		return ans;
	}
}
