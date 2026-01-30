package LeetCode;

public class Target_Sum_494 {

	public static int count = 0;

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1, 1 };
		int target = 3;
		Target_Sum(nums, target, 0, 0);
		System.out.print(count);
	}

	public static void Target_Sum(int[] nums, int target, int idx, int sum) {
		if (sum == target && idx == nums.length) {
			count++;
			return;
		}
		if (idx >= nums.length) {
			return;
		}
		Target_Sum(nums, target, idx + 1, sum + nums[idx]);
		Target_Sum(nums, target, idx + 1, sum - nums[idx]);
	}
}
