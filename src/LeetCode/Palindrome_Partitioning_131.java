package LeetCode;

import java.util.*;

public class Palindrome_Partitioning_131 {

	public static void main(String[] args) {
		String s = "aab";
		List<String> temp = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Palindrome_Partitioning(s, temp, ans);
		System.out.print(ans);
	}

	public static void Palindrome_Partitioning(String ques, List<String> temp, List<List<String>> ans) {
		if (ques.length() == 0) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (Palindrome(s)) {
				temp.add(s);
				Palindrome_Partitioning(ques.substring(i), temp, ans);
				temp.remove(temp.size() - 1);
			}
		}
	}

	public static boolean Palindrome(String s1) {
		int low = 0;
		int high = s1.length() - 1;
		while (low <= high) {
			if (s1.charAt(low) != s1.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	
}
