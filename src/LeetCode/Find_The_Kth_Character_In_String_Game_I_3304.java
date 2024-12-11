package LeetCode;

public class Find_The_Kth_Character_In_String_Game_I_3304 {

	public static void main(String[] args) {
		int k = 5;
		char ans = Find_The_Kth_Character_In_String_Game_I(k, "a");
		System.out.println(ans);
	}

	public static char Find_The_Kth_Character_In_String_Game_I(int k, String s) {
		if (s.length() > k) {
			return s.charAt(k - 1);
		}
		return Find_The_Kth_Character_In_String_Game_I(k, Append_String(s));
	}

	public static String Append_String(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int temp = ch[i];
			temp++;
			char c = (char) temp;
			s += c;
		}
		return s;
	}
	
}
