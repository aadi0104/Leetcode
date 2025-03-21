package LeetCode;

public class Reverse_Words_In_A_String_151 {

	public static void main(String[] args) {
		String s = "the sky is blue";
		String ans = Reverse_Words_In_A_String(s);
		System.out.print(ans);
	}

	public static String Reverse_Words_In_A_String(String s) {
		String[] ans = s.split(" +");
		String a = "";
		for (int i = ans.length - 1; i >= 0; i--) {
			a += ans[i] + " ";
		}
		a = a.trim();
		return a;
	}
	
}
