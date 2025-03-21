package LeetCode;

public class Subarray_Product_Less_Than_K_713 {

	public static void main(String[] args) {
		int[] nums = { 10, 5, 2, 6 };
		int k = 100;
		int ans = Subarray_Product_Less_Than_K(nums, k);
		System.out.print(ans);
	}

	public static int Subarray_Product_Less_Than_K(int[] nums, int k) {
		int st = 0;
		int en = 0;
		int ans = 0;
		int p = 1;
		while (en < nums.length) {
			p *= nums[en];
			while (p >= k && st <= en) {
				p /= nums[st];
				st++;
			}
			ans += (en - st + 1);
			en++;
		}
		return ans;
	}

}
