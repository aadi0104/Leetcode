package LeetCode;

public class Palindrome_Number_9 {

	public boolean main(String[] args) {
		int x = 121;
		if (x < 0) {
			return false;
		} else {
			return x == Palindrome_Number(x, 0);
		}
	}

	public int Palindrome_Number(int x, int rev) {
		if (x == 0) {
			return rev;
		}
		return Palindrome_Number(x / 10, rev * 10 + x % 10);
	}
}
