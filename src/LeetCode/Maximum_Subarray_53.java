package LeetCode;

public class Maximum_Subarray_53 {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int ans = Maximum_Subarray(nums);
		System.out.print(ans);
	}

	public static int Maximum_Subarray(int[] nums) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			ans = Math.max(sum, ans);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
