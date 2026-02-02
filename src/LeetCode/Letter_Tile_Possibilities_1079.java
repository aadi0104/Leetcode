package LeetCode;

import java.util.*;

public class Letter_Tile_Possibilities_1079 {

	public static void main(String[] args) {
		String tiles = "AAB";
		boolean[] check = new boolean[tiles.length()];
		Set<String> s = new HashSet<>();
		Letter_Tile_Possibilities(tiles, "", check, s);
		System.out.print(s.size());
	}

	public static void Letter_Tile_Possibilities(String tiles, String ans, boolean[] check, Set<String> s) {
		if (ans.length() > tiles.length()) {
			return;
		}
		if (ans.length() > 0) {
			s.add(ans);
		}
		for (int i = 0; i < tiles.length(); i++) {
			if (!check[i]) {
				check[i] = true;
				Letter_Tile_Possibilities(tiles, ans + tiles.charAt(i), check, s);
				check[i] = false;
			}
		}
	}
}