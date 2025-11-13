package LeetCode;

public class Length_Of_Last_Word_58 {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		int ans = Length_Of_Last_Word(s);
		System.out.print(ans);
	}

	public static int Length_Of_Last_Word(String s) {
		s = s.trim();
		String[] arr = s.split(" +");
		return arr[arr.length - 1].length();
	}

}
