package LeetCode;

public class Backspace_String_Compare_844 {

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		boolean ans = Backspace_String_Compare(s, t);
		System.out.print(ans);
	}

	public static boolean Backspace_String_Compare(String s, String t) {
		s = Remove_Characters(s);
		t = Remove_Characters(t);
		if (s.equals(t)) {
			return true;
		}
		return false;
	}

	public static String Remove_Characters(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (str.length() > 0) {
					str = str.substring(0, str.length() - 1);
				}
			} else {
				str += s.charAt(i);
			}
		}
		return str;
	}

}