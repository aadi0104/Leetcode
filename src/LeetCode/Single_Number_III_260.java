package LeetCode;

public class Single_Number_III_260 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		int[] ans = Single_Number_III(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] Single_Number_III(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans ^= nums[i];
		}
		int mask = ans & (~(ans - 1));
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & mask) != 0) {
				a ^= nums[i];
			}
		}
		int b = ans ^ a;
		int[] fin = { a, b };
		return fin;
	}

}
