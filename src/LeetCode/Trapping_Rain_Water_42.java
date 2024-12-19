package LeetCode;

public class Trapping_Rain_Water_42 {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int ans = Trapping_Rain_Water(height);
		System.out.print(ans);
	}

	public static int Trapping_Rain_Water(int[] height) {
		int n = height.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int sum = 0;
		int max1 = height[0];
		int max2 = height[n - 1];
		left[0] = max1;
		right[n - 1] = max2;
		for (int i = 1; i < left.length; i++) {
			if (height[i] > max1) {
				max1 = height[i];
			}
			left[i] = max1;
		}
		for (int i = right.length - 2; i >= 0; i--) {
			if (height[i] > max2) {
				max2 = height[i];
			}
			right[i] = max2;
		}
		for (int i = 0; i < n; i++) {
			int min = Math.min(left[i], right[i]);
			sum += min - height[i];
		}
		return sum;
	}

}
