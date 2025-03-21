package LeetCode;

public class Product_Of_Array_Except_Self_238 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] ans = Product_Of_Array(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + ", ");
		}
	}

	public static int[] Product_Of_Array(int[] nums) {
		int n = nums.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 1;
		right[n - 1] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}
		for (int i = 0; i < n; i++) {
			left[i] *= right[i];
		}
		return left;
	}

}
