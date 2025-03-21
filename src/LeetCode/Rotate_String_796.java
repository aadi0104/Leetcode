package LeetCode;

public class Rotate_String_796 {

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		boolean ans = Rotate_String(s, goal);
		System.out.print(ans);
	}

	public static boolean Rotate_String(String s, String goal) {
		if (s.equals(goal)) {
			return true;
		} else {
			for (int i = 0; i < s.length(); i++) {
				s = Rotate(s, 1, s.length() - 1);
				s = Rotate(s, 0, s.length() - 1);
				if (s.equals(goal)) {
					return true;
				}
			}
		}
		return false;
	}

	public static String Rotate(String s, int start, int end) {
		char[] ch = s.toCharArray();
		int low = start;
		int high = end;
		while (low <= high) {
			char temp = ch[low];
			ch[low] = ch[high];
			ch[high] = temp;
			low++;
			high--;
		}
		String str = new String(ch);
		return str;
	}
	
}
