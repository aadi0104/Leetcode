package LeetCode;

public class Valid_Perfect_Square_367 {

	public static void main(String[] args) {
		int n = 8;
		boolean ans = Valid_Perfect_Square(n);
		System.out.print(ans);
	}

	public static boolean Valid_Perfect_Square(int num) {
		if (num <= 0)
			return false;
		if (num == 1)
			return true;
		long low = 1;
		long high = num / 2;
		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (mid * mid == num) {
				return true;
			} else if (mid * mid < num) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}
}