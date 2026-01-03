package LeetCode;

public class Longest_Increasing_Subsequence_300 {

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int ans = Longest_Increasing_Subsequence(nums);
		System.out.print(ans);
	}

	public static int Longest_Increasing_Subsequence(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 1;
		dp[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (dp[len - 1] < nums[i]) {
				dp[len] = nums[i];
				len++;
			} else {
				int idx = Binary_Search(dp, 0, len - 1, nums[i]);
				dp[idx] = nums[i];
			}
		}
		return len;
	}

	public static int Binary_Search(int[] dp, int st, int en, int item) {
		int idx = 0;
		while (st <= en) {
			int mid = st + (en - st) / 2;
			if (dp[mid] >= item) {
				idx = mid;
				en = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return idx;
	}
}