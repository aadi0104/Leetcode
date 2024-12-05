package LeetCode;

public class Rotate_Array_189 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		int shift = k % nums.length;
		Rotate_Array(nums, shift);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}

	public static void Rotate_Array(int[] nums, int k) {
		if (nums.length > 1) {
			Reverse_Array(nums, 0, nums.length - k - 1);
			Reverse_Array(nums, nums.length - k, nums.length - 1);
			Reverse_Array(nums, 0, nums.length - 1);
		}
	}

	public static void Reverse_Array(int[] nums, int start, int end) {
		while (true) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
			if (start >= end) {
				break;
			}
		}
	}
	
}
