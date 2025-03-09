package LeetCode;

//import java.util.*;

public class Partition_Array_According_To_Given_Pivot_2161 {

	public static void main(String[] args) {
		int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
		int pivot = 10;
		Partition_Array_According_To_Given_Pivot(nums, pivot);
	}

//	public static int[] Partition_Array_According_To_Given_Pivot(int[] nums, int pivot) {
//		int[] ans = new int[nums.length];
//		int k = 0;
//		int count = 0;
//		Queue<Integer> q = new LinkedList<>();
//		for (int num : nums) {
//			if (num < pivot) {
//				ans[k] = num;
//				k++;
//			} else if (num == pivot) {
//				count++;
//			} else {
//				q.add(num);
//			}
//		}
//		for (int i = 0; i < count; i++) {
//			ans[k] = pivot;
//			k++;
//		}
//		while (!q.isEmpty()) {
//			ans[k] = q.poll();
//			k++;
//		}
//		return ans;
//	}

	public static int[] Partition_Array_According_To_Given_Pivot(int[] nums, int pivot) {
		int n = nums.length;
		int m = 0;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			if (nums[i] < pivot) {
				ans[m] = nums[i];
				m++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (nums[i] == pivot) {
				ans[m] = nums[i];
				m++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (nums[i] > pivot) {
				ans[m] = nums[i];
				m++;
			}
		}
		return ans;
	}
	
}
