package LeetCode;

import java.util.*;

public class Group_Anagrams_49 {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.print(Group_Anagrams(strs));
	}

	public static List<List<String>> Group_Anagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		List<List<String>> ans = new ArrayList<>();
		for (int i = 0; i < strs.length; i++) {
			String code = Generate_Hash_Code(strs[i]);
			List<String> temp;
			if (map.containsKey(code)) {
				temp = map.get(code);
			} else {
				temp = new ArrayList<>();
			}
			temp.add(strs[i]);
			map.put(code, temp);
		}
		for (List<String> temp : map.values()) {
			ans.add(temp);
		}
		return ans;
	}

	public static String Generate_Hash_Code(String s) {
		StringBuilder sb = new StringBuilder();
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i] + " ");
		}
		return sb.toString();
	}

}
