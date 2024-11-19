package LeetCode;

import java.util.Arrays;

public class Unique_Morse_Code_Words_804 {

	public static void main(String[] args) {
		String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] words = { "gin", "zen", "gig", "msg" };
		int ans = Unique_Morse_Code_Words(codes, words);
		System.out.print(ans);
	}

	public static int Unique_Morse_Code_Words(String[] codes, String[] words) {
		String[] morseArray = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			morseArray[i] = Create_Morse_Code(codes, words[i]);
		}
		return Count_Duplicate_Codes(morseArray);
	}

	public static String Create_Morse_Code(String[] codes, String word) {
		String morseCode = "";
		for (int i = 0; i < word.length(); i++) {
			int ch = word.charAt(i);
			int morseIndex = ch - 97;
			morseCode += codes[morseIndex];
		}
		return morseCode;
	}

	public static int Count_Duplicate_Codes(String[] morseArray) {
		Arrays.sort(morseArray);
		String s = morseArray[0];
		if (morseArray.length > 1) {
			int count = 1;
			for (int i = 1; i < morseArray.length; i++) {
				if (s.equals(morseArray[i])) {
					continue;
				} else {
					count++;
					s = morseArray[i];
				}
			}
			return count;
		}
		return 1;
	}
}
