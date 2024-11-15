package LeetCode;

public class Guess_Number_Higher_Or_Lower_374 {

	public static void main(String[] args) {
		int n = 10;
		int ans = Guess_Number_Higher_Or_Lower(n);
		System.out.print(ans);
	}

	public static int Guess_Number_Higher_Or_Lower(int n) {
		int low = 0;
		int high = n;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (guess(mid) == 0) {
				ans = mid;
				break;
			} else if (guess(mid) == -1) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int guess(int mid) {
		int pick = 6;
		int ans = -1;
		if (mid == pick) {
			ans = 0;
		} else if (mid < pick) {
			ans = 1;
		}
		return ans;
	}

}
