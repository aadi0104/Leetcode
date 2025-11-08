package LeetCode;

public class Reverse_Words_In_A_String_III_557 {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String ans = Reverse_Words_In_A_String_III(s);
		System.out.print(ans);
	}

	public static String Reverse_Words_In_A_String_III(String s) {
		String[] arr = s.split(" +");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Reverse_String(arr[i]);
		}
		String ans = String.join(" ", arr);
		return ans;
	}

	public static String Reverse_String(String s) {
		char[] ch = s.toCharArray();
		int low = 0;
		int high = ch.length - 1;
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
