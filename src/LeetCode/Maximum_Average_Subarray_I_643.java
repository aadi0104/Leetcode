package LeetCode;

public class Maximum_Average_Subarray_I_643 {

	public static void main(String[] args) {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double ans = Maximum_Average_Subarray_I(nums, k);
		System.out.print(ans);
	}

	public static double Maximum_Average_Subarray_I(int[] nums, int k) {
		double ans = 0;
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		ans = sum;
		for (int i = k; i < nums.length; i++) {
			sum += nums[i];
			sum -= nums[i - k];
			ans = Math.max(ans, sum);
		}
		return ans / k;
	}
	
}
