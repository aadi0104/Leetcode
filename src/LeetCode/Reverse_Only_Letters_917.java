package LeetCode;

public class Reverse_Only_Letters_917 {

	public static void main(String[] args) {
		String s = "Test1ng-Leet=code-Q!";
		String ans = Reverse_Only_Letters(s);
		System.out.print(ans);
	}

	public static String Reverse_Only_Letters(String s) {
		char[] ch = s.toCharArray();
		int low = 0;
		int high = ch.length - 1;
		while (low <= high) {
			if (Check_Alphabet(ch[low]) && Check_Alphabet(ch[high])) {
				char temp = ch[low];
				ch[low] = ch[high];
				ch[high] = temp;
				low++;
				high--;

			} else if (Check_Alphabet(ch[low]) != true && Check_Alphabet(ch[high])) {
				low++;
			} else if (Check_Alphabet(ch[low]) && Check_Alphabet(ch[high]) != true) {
				high--;
			} else {
				low++;
				high--;
			}
		}
		String str = new String(ch);
		return str;
	}

	public static boolean Check_Alphabet(char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			return true;
		}
		return false;
	}
}
