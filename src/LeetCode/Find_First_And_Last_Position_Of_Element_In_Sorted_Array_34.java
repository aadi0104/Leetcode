package LeetCode;

public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array_34 {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] ans = SearchUsingBinary(nums, target);
		System.out.print(ans[0] + "," + ans[1]);
	}

	public static int[] SearchUsingBinary(int[] nums, int target) {
		int[] ans = { -1, -1 };
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				ans[0] = mid;
				if (ans[1] == -1) {
					ans[1] = SearchLiner(nums, mid, nums.length);
				}
				high = mid - 1;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int SearchLiner(int[] nums, int start, int end) {
		int target = nums[start];
		int ans = start;
		for (int i = start; i < end; i++) {
			if (nums[i] == target) {
				ans = i;
			} else {
				break;
			}
		}
		return ans;
	}

}
