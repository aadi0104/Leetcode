package LeetCode;

import java.util.*;

public class Kth_Largest_Element_In_An_Array_215 {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		int ans = Kth_Largest_Element_In_An_Array(nums, k);
		System.out.print(ans);
	}

	public static int Kth_Largest_Element_In_An_Array(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			if (nums[i] >= pq.peek()) {
				pq.poll();
				pq.add(nums[i]);
			}
		}
		return pq.peek();
	}
	
}
