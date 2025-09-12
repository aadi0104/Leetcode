package LeetCode;

import java.util.*;

public class Subsets_78 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Subsets(nums, temp, ans, 0);
		System.out.print(ans);
	}

	public static void Subsets(int[] nums, List<Integer> temp, List<List<Integer>> ans, int idx) {
		ans.add(new ArrayList<>(temp));
		if (temp.size() == nums.length) {
			return;
		}
		for (int i = idx; i < nums.length; i++) {
			temp.add(nums[i]);
			Subsets(nums, temp, ans, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

}
