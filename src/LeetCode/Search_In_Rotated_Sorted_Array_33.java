package LeetCode;

public class Search_In_Rotated_Sorted_Array_33 {

	public static void main(String[] args) {
		int[] nums = { 3, 1 };
		int target = 1;
		int ans = Search_In_Rotated_Sorted_Array(nums, target);
		System.out.print(ans);
	}

	public static int Search_In_Rotated_Sorted_Array(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] >= nums[low]) {
				if (nums[low] <= target && nums[mid] > target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (nums[mid] < target && nums[high] >= target) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
	
}
