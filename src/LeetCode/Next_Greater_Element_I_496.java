package LeetCode;

import java.util.*;

public class Next_Greater_Element_I_496 {

	public static void main(String[] args) {
		int[] nums1 = { 2, 4 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] ans = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			ans[i] = Next_Greater_Element_I(nums2, nums1[i]);
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int Next_Greater_Element_I(int[] nums2, int num) {
		Stack<Integer> st = new Stack<>();
		for (int i = nums2.length - 1; i >= 0; i--) {
			if (nums2[i] == num) {
				break;
			}
			while (!st.isEmpty() && nums2[i] > nums2[st.peek()]) {
				st.pop();
			}
			st.push(i);
		}
		while (!st.isEmpty() && nums2[st.peek()] <= num) {
			st.pop();
		}
		if (st.isEmpty()) {
			return -1;
		}
		return nums2[st.peek()];
	}
}
