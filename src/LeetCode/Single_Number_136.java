package LeetCode;

public class Single_Number_136 {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		System.out.print(Single_Number(nums));
	}

	public static int Single_Number(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans ^= nums[i];
		}
		return ans;
	}
}
