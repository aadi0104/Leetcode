package LeetCode;

import java.util.*;

public class Valid_Anagram_242 {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		boolean ans = Valid_Anagram(s, t);
		System.out.print(ans);
	}

	public static boolean Valid_Anagram(String s, String t) {
		String[] str1 = s.split("");
		String[] str2 = t.split("");
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Compare_Strings(str1, str2);
	}

	public static boolean Compare_Strings(String[] str1, String[] str2) {
		if (str1.length != str2.length) {
			return false;
		}
		int low = 0;
		int high = str1.length - 1;
		while (low <= high) {
			if (str1[low].charAt(0) != str2[low].charAt(0)) {
				return false;
			}
			if (str1[high].charAt(0) != str2[high].charAt(0)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
