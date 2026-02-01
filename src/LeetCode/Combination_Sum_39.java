package LeetCode;

import java.util.*;

public class Combination_Sum_39 {

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination_Sum(candidates, target, temp, ans, 0, 0);
		System.out.print(ans);
	}

	public static void Combination_Sum(int[] candidates, int target, List<Integer> temp, List<List<Integer>> ans,
			int sum, int idx) {
		if (sum == target) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		if (sum > target) {
			return;
		}

		for (int i = idx; i < candidates.length; i++) {
			temp.add(candidates[i]);
			Combination_Sum(candidates, target, temp, ans, sum + candidates[i], i);
			temp.remove(temp.size() - 1);
		}
	}
}