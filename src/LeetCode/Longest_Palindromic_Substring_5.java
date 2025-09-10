package LeetCode;

public class Longest_Palindromic_Substring_5 {

	public static void main(String[] args) {
		String s = "babad";
		String ans = Longest_Palindromic_Substring(s);
		System.out.println(ans);
	}

	public static String Longest_Palindromic_Substring(String s) {
		String max_str = "";
		int size = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; i - j >= 0 && i + j < s.length(); j++) {
				if (s.charAt(i - j) != s.charAt(i + j)) {
					break;
				}
				int newSize = 2 * j + 1;
				if (newSize > size) {
					max_str = s.substring(i - j, i + j + 1);
					size = newSize;
				}
			}
		}
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = 0; i - j >= 0 && i + j + 1 < s.length(); j++) {
				if (s.charAt(i - j) != s.charAt(i + j + 1)) {
					break;
				}
				int newSize = 2 * (j + 1);
				if (newSize > size) {
					max_str = s.substring(i - j, i + j + 2);
					size = newSize;
				}
			}
		}
		return max_str;
	}

}
