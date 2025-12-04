package LeetCode;

import java.util.*;

public class Permutations_II_47 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		boolean[] check = new boolean[nums.length];
		Permutations_II(nums, temp, ans, check);
		System.out.print(ans);
	}

	public static void Permutations_II(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] check) {
		if (temp.size() == nums.length && !ans.contains(temp)) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!check[i]) {
				temp.add(nums[i]);
				check[i] = true;
				Permutations_II(nums, temp, ans, check);
				check[i] = false;
				temp.remove(temp.size() - 1);
			}
		}

	}
}
