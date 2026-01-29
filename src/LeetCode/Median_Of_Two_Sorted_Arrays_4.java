package LeetCode;

public class Median_Of_Two_Sorted_Arrays_4 {

	public double main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		int[] ans = Median_Of_Two_Sorted_Arrays(nums1, nums2);
		int len = ans.length;
		double fin;
		if ((len & 1) == 0) {
			fin = ((ans[len / 2]) + (ans[(len / 2) - 1])) / 2.0;
		} else {
			fin = (double) (ans[len / 2]);
		}
		return fin;
	}

	public int[] Median_Of_Two_Sorted_Arrays(int nums1[], int nums2[]) {
		int n = nums1.length, m = nums2.length;
		int i = 0, j = 0, k = 0;
		int[] ans = new int[n + m];
		while (i < n && j < m) {
			if (nums1[i] < nums2[j]) {
				ans[k] = nums1[i];
				i++;
				k++;
			} else {
				ans[k] = nums2[j];
				j++;
				k++;
			}
		}
		for (; i < n; i++) {
			ans[k] = nums1[i];
			k++;
		}
		for (; j < m; j++) {
			ans[k] = nums2[j];
			k++;
		}
		return ans;
	}
}