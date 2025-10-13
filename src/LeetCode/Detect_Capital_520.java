package LeetCode;

public class Detect_Capital_520 {
	public static void main(String[] args) {
		String s = "USA";
		boolean ans = Detect_Capital(s);
		System.out.print(ans);
	}

	public static boolean Detect_Capital(String s) {
		if (s.length() > 1) {
			if (Character.isUpperCase(s.charAt(0))) {
				if (Character.isUpperCase(s.charAt(1))) {
					for (int i = 1; i < s.length(); i++) {
						if (Character.isUpperCase(s.charAt(i)) == false) {
							return false;
						}
					}
					return true;
				} else {
					for (int i = 1; i < s.length(); i++) {
						if (Character.isUpperCase(s.charAt(i))) {
							return false;
						}
					}
					return true;
				}
			} else {
				for (int i = 1; i < s.length(); i++) {
					if (Character.isUpperCase(s.charAt(i))) {
						return false;
					}
				}
				return true;
			}
		} else {
			return true;
		}
	}
}
