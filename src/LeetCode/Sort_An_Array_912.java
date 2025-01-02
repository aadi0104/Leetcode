package LeetCode;

public class Sort_An_Array_912 {

	public static void main(String[] args) {
		int[] nums = { 5, 2, 3, 1 };
		int[] ans = Sort_An_Array(nums, 0, nums.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] Sort_An_Array(int[] nums, int start, int end) {
		if (start == end) {
			int[] arr = new int[1];
			arr[0] = nums[start];
			return arr;
		}
		int mid = (start + end) / 2;
		return Merge(Sort_An_Array(nums, start, mid), Sort_An_Array(nums, mid + 1, end));
	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length, m = arr2.length;
		int i = 0, j = 0, k = 0;
		int[] ans = new int[n + m];
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		for (; i < n; i++) {
			ans[k] = arr1[i];
			k++;
		}
		for (; j < m; j++) {
			ans[k] = arr2[j];
			k++;
		}
		return ans;
	}
	
}
