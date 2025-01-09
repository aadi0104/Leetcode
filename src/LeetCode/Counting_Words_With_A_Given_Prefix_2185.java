package LeetCode;

public class Counting_Words_With_A_Given_Prefix_2185 {

	public static void main(String[] args) {
		String[] words = { "pay", "attention", "practice", "attend" };
		String pref = "at";
		int ans = Counting_Words_With_A_Given_Prefix(words, pref);
		System.out.print(ans);
	}

	public static int Counting_Words_With_A_Given_Prefix(String[] words, String pref) {
		int wlen = pref.length();
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= wlen && words[i].substring(0, wlen).equals(pref)) {
				count++;
			}
		}
		return count;
	}

}
