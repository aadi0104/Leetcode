package LeetCode;

public class Jewels_And_Stones_771 {

	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int ans = Jewels_And_Stones(jewels, stones);
		System.out.print(ans);
	}

	public static int Jewels_And_Stones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < jewels.length(); i++) {
			if (stones.indexOf(jewels.charAt(i)) != -1) {
				stones = Remove_Character_At_Index(stones, stones.indexOf(jewels.charAt(i)));
				i--;
				count++;
			}
		}
		return count;
	}

	public static String Remove_Character_At_Index(String s, int i) {
		char [] ch = s.toCharArray();
		ch[i] = ' ';
		String str = new String(ch);
		return str;
	}
}