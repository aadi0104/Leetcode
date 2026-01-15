package LeetCode;
import java.util.Arrays;

public class House_Robber_198 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int[] dp = new int[nums.length + 1];
		Arrays.fill(dp, -1);
		int ans = House_Robber(nums, 0, dp);
		System.out.print(ans);
	}

	public static int House_Robber(int[] nums, int i, int[] dp) {
		if (i >= nums.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int inc = nums[i] + House_Robber(nums, i + 2, dp);
		int exc = House_Robber(nums, i + 1, dp);
		return dp[i] = Math.max(inc, exc);
	}

}
