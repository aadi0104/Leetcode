package LeetCode;

import java.util.*;

public class Longest_Consecutive_Sequence_128 {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		int ans = Longest_Consecutive_Sequence(nums);
		System.out.print(ans);
	}

	public static int Longest_Consecutive_Sequence(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i]) && !set.contains(nums[i] - 1)) {
				int v = nums[i];
				int count = 0;
				while (set.contains(v)) {
					set.remove(v);
					v++;
					count++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
	}

}
