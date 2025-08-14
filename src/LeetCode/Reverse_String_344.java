package LeetCode;

public class Reverse_String_344 {

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		Reverse_String(s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}

	public static void Reverse_String(char[] s) {
		int low = 0;
		int high = s.length - 1;
		while (low <= high) {
			char temp = s[low];
			s[low] = s[high];
			s[high] = temp;
			low++;
			high--;
		}
	}
	
}
