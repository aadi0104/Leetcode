package LeetCode;

import java.util.*;

public class Subsets_II_90 {

	public static void main(String[] args) {
		int[] nums = { 4, 4, 4, 1, 4 };
		Arrays.sort(nums);
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Subsets_II(nums, temp, ans, 0);
		System.out.print(ans);
	}

	public static void Subsets_II(int[] nums, List<Integer> temp, List<List<Integer>> ans, int idx) {
		if (isNotPresent(temp, ans)) {
			ans.add(new ArrayList<>(temp));
		}
		if (temp.size() == nums.length) {
			return;
		}
		for (int i = idx; i < nums.length; i++) {
			temp.add(nums[i]);
			Subsets_II(nums, temp, ans, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

	public static boolean isNotPresent(List<Integer> temp, List<List<Integer>> ans) {
		for (int i = 0; i < ans.size(); i++) {
			if (ans.get(i).equals(temp)) {
				return false;
			}
		}
		return true;
	}
	
}
