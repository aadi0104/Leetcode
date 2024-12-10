package LeetCode;

import java.util.*;

public class Combinations_77 {

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combinations(n, k, temp, ans, 1);
		System.out.println(ans);
	}

	public static void Combinations(int n, int k, List<Integer> temp, List<List<Integer>> ans, int idx) {
		if (temp.size() == k) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for (int i = idx; i <= n; i++) {
			temp.add(i);
			Combinations(n, k, temp, ans, i + 1);
			temp.remove(temp.size() - 1);
		}
	}
	
}
