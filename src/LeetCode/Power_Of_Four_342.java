package LeetCode;

public class Power_Of_Four_342 {

	public static void main(String[] args) {
		int n = 16;
		boolean ans = Power_Of_Four(n);
		System.out.print(ans);
	}

	public static boolean Power_Of_Four(int n) {
		if (n == 1) {
			return true;
		}
		if (n == 0) {
			return false;
		}
		if (n % 4 != 0) {
			return false;
		}
		return Power_Of_Four(n / 4);
	}

}