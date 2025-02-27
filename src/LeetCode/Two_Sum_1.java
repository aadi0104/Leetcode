package LeetCode;

import java.util.*;

public class Two_Sum_1 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		Two_Sum(nums, target);
	}

	public static int[] Two_Sum(int[] nums, int target) {
		int[] ans = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int rem = target - nums[i];
			if (map.containsKey(rem) && map.get(rem) != i) {
				ans[0] = i;
				ans[1] = map.get(rem);
			}
		}
		return ans;
	}

}
