package LeetCode;

public class Ransom_Note_383 {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";
		boolean ans = Ransom_Note(ransomNote, magazine);
		System.out.print(ans);
	}

	public static boolean Ransom_Note(String a, String b) {
		if (b.length() < a.length()) {
			return false;
		}
		int lenA = a.length();
		int count = 0;
		for (int i = 0; i < lenA; i++) {
			if (b.indexOf(a.charAt(i)) != -1) {
				b = Update_String(b, b.indexOf(a.charAt(i)));
				count++;
			}
		}
		if (count == lenA) {
			return true;
		}
		return false;
	}

	public static String Update_String(String b, int i) {
		StringBuilder sb = new StringBuilder(b);
		sb.deleteCharAt(i);
		return sb.toString();
	}
	
}
