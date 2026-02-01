package LeetCode;

public class First_Bad_Version_278 {

	public static void main(String[] args) {
		int n = 8;
		int ans = Fisrt_Bad_Version(n);
		System.out.print(ans);
	}

	public static int Fisrt_Bad_Version(int n) {
		int low = 1;
		int high = n;
		int ans = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (isBadVersion(mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isBadVersion(int x) {
		/*
		 * The isBadVersion API is defined in the parent class VersionControl. boolean
		 */
		return true;
	}
}