package LeetCode;

import java.util.*;

public class Sliding_Window_Maximum_239 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		Sliding_Window_Maximum(nums, k);
	}

	public static int[] Sliding_Window_Maximum(int[] nums, int k) {
		Deque<Integer> dq = new LinkedList<>();
		int[] ans = new int[nums.length - k + 1];
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		int j = 0;
		ans[j++] = nums[dq.getFirst()];
		for (int i = k; i < nums.length; i++) {
			while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) {
				dq.removeLast();
			}
			dq.addLast(i);

			if (dq.getFirst() == i - k) {
				dq.removeFirst();
			}

			ans[j++] = nums[dq.getFirst()];
		}
		return ans;
	}
}