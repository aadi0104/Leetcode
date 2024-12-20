package LeetCode;

public class Search_Insert_Position_35 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		System.out.print(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				low = mid;
			}
			if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

}
