package LeetCode;

public class Goat_Latin_824 {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumped over the lazy dog";
		String ans = Goat_Latin(sentence);
		System.out.print(ans);
	}

	public static String Goat_Latin(String sentence) {
		String[] s = sentence.split(" +");
		int count = 1;
		String ans = "";
		for (int i = 0; i < s.length; i++) {
			if (Check_Vowel(s[i])) {
				ans += Add_To_End(s[i], count, true) + " ";
				count++;
			} else {
				ans += Add_To_End(s[i], count, false) + " ";
				count++;
			}
		}
		return ans.trim();
	}

	public static String Add_To_End(String s, int count, boolean flag) {
		String str = "a";
		String finalStr = "ma";
		finalStr += str.repeat(count);
		if (flag) {
			finalStr = s + finalStr;
		} else {
			char first = s.charAt(0);
			s += first;
			s = s.substring(1, s.length());
			finalStr = s + finalStr;
		}
		return finalStr;
	}

	public static boolean Check_Vowel(String c) {
		String vowels = "aeiouAEIOU";
		char check = c.charAt(0);
		if (vowels.indexOf(check) != -1) {
			return true;
		}
		return false;
	}
	
}
