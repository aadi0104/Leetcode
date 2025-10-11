package LeetCode;

public class To_Lower_Case_709 {

	public static void main(String[] args) {
		String s = "Hell56o35//";
		String ans = To_Lower_Case(s);
		System.out.print(ans);
	}

	public static String To_Lower_Case(String s) {
		char[] ch = s.toCharArray();
		int low = 0;
		int high = ch.length - 1;
		while (low <= high) {
			if (Character.isUpperCase(ch[low])) {
				int ascii = ch[low];
				ascii += 32;
				ch[low] = (char) ascii;
			}
			if (Character.isUpperCase(ch[high])) {
				int ascii = ch[high];
				ascii += 32;
				ch[high] = (char) ascii;
			}
			low++;
			high--;
		}
		return Char_Array_To_String(ch);
	}

	public static String Char_Array_To_String(char[] ch) {
		String s = new String(ch);
		return s;
	}
}
