package LeetCode;

public class Maximum_Score_After_Splitting_A_String_1422 {
	public static int maxx = 0;

	public static void main(String[] args) {
		String s = "011101";
		Maximum_Score_After_Splitting_A_String(s, s.substring(0, 1), s.substring(1), 1);
		System.out.println(maxx);
	}

	public static void Maximum_Score_After_Splitting_A_String(String s, String left, String right, int idx) {
		if (right.length() < 1) {
			return;
		}
		if ((CountZeroes(left) + CountOnes(right)) > maxx) {
			maxx = (CountZeroes(left) + CountOnes(right));
		}
		Maximum_Score_After_Splitting_A_String(s, s.substring(0, idx + 1), s.substring(idx + 1), idx + 1);
	}

	public static int CountOnes(String right) {
		int ones = 0;
		for (int i = 0; i < right.length(); i++) {
			if (right.charAt(i) == '1') {
				ones++;
			}
		}
		return ones;
	}

	public static int CountZeroes(String left) {
		int zeroes = 0;
		for (int i = 0; i < left.length(); i++) {
			if (left.charAt(i) == '0') {
				zeroes++;
			}
		}
		return zeroes;
	}

}
