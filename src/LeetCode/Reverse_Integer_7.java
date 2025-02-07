package LeetCode;

public class Reverse_Integer_7 {

	public int main(String[] args) {
		int x = 123;
		if (x < 0) {
			return -Reverse_Integer(-x, 0);
		}
		return Reverse_Integer(x, 0);
	}

	public int Reverse_Integer(int x, int rev) {
		if (x == 0) {
			return rev;
		}
		int lastDigit = x % 10;
		int newRev = rev * 10 + lastDigit;
		if ((newRev - lastDigit) / 10 != rev) {
			return 0;
		}
		return Reverse_Integer(x / 10, newRev);
	}
}
