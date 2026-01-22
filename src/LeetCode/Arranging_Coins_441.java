package LeetCode;

public class Arranging_Coins_441 {

	public static void main(String[] args) {
		int n = 5;
		int ans = arrangeCoins(n);
		System.out.print(ans);
	}

	public static int arrangeCoins(int n) {
		long low = 0;
		long n_long = (long) n;
		long high = n_long;
		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (mid * (mid + 1) / 2 <= n_long) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return (int) low - 1;
	}
}