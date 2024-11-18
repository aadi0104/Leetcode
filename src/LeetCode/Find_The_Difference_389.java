package LeetCode;

public class Find_The_Difference_389 {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		char ans = Find_The_Difference(s, t);
		System.out.print(ans);
	}

	public static char Find_The_Difference(String s, String t) {
		for (int i = 0; i < s.length(); i++) {
			if (t.indexOf(s.charAt(i)) != -1) {
				t = Remove_Character(t, t.indexOf(s.charAt(i)));
			}
		}
		char[] ans = t.toCharArray();
		return ans[0];

	}

	public static String Remove_Character(String t, int i) {
		StringBuilder sb = new StringBuilder(t);
		sb.deleteCharAt(i);
		return sb.toString();
	}

}
