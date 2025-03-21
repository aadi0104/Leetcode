package LeetCode;

import java.util.*;

public class Merge_Two_2D_Arrays_By_Summing_Values_2570 {

	public static void main(String[] args) {
		int[][] nums1 = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
		int[][] nums2 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		Merge_Two_2D_Arrays_By_Summing_Values(nums1, nums2);
	}

	public static int[][] Merge_Two_2D_Arrays_By_Summing_Values(int[][] nums1, int[][] nums2) {
		int i = 0;
		int j = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int k = 0; k < nums1.length; k++) {
			set.add(nums1[k][0]);
		}
		for (int k = 0; k < nums2.length; k++) {
			set.add(nums2[k][0]);
		}
		int[][] ans = new int[set.size()][2];
		int k = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i][0] < nums2[j][0]) {
				ans[k][0] = nums1[i][0];
				ans[k][1] = nums1[i][1];
				i++;
			} else if (nums1[i][0] > nums2[j][0]) {
				ans[k][0] = nums2[j][0];
				ans[k][1] = nums2[j][1];
				j++;
			} else {
				ans[k][0] = nums1[i][0];
				ans[k][1] = nums1[i][1] + nums2[j][1];
				i++;
				j++;
			}
			k++;
		}

		while (i < nums1.length) {
			ans[k][0] = nums1[i][0];
			ans[k][1] = nums1[i][1];
			i++;
			k++;
		}

		while (j < nums2.length) {
			ans[k][0] = nums2[j][0];
			ans[k][1] = nums2[j][1];
			j++;
			k++;
		}

		return ans;
	}

}
