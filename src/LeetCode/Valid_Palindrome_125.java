package LeetCode;

import java.util.*;

public class Valid_Palindrome_125 {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean ans = Valid_Palindrome(s);
		System.out.print(ans);
	}

	public static boolean Valid_Palindrome(String s) {
		s = s.trim();
		s = s.toLowerCase();
		String[] arr = s.split("[\\W _]+");
		s = String.join("", arr);
		return checkPalindrome(s);
	}

	public static boolean checkPalindrome(String s) {
		int low = 0;
		int high = s.length() - 1;
		while (low <= high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}s

}
