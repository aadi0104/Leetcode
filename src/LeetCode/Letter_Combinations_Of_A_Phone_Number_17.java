package LeetCode;

import java.util.*;

public class Letter_Combinations_Of_A_Phone_Number_17 {

	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String digits = "23";
		List<String> s = new ArrayList<>();
		if (digits.length() == 0) {
			System.out.println(s);
		}
		Letter_Combinations_Of_A_Phone_Number(digits, "", s);
		System.out.println(s);
	}

	public static void Letter_Combinations_Of_A_Phone_Number(String digits, String ans, List<String> s) {
		if (digits.length() == 0) {
			s.add(ans);
			return;
		}
		int key_index = digits.charAt(0);
		key_index -= (int) '0';
		String key_values = key[key_index];
		for (int i = 0; i < key_values.length(); i++) {
			Letter_Combinations_Of_A_Phone_Number(digits.substring(1), ans + key_values.charAt(i), s);
		}
	}

}
