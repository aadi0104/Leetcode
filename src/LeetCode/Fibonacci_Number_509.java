package LeetCode;

public class Fibonacci_Number_509 {

	public static void main(String[] args) {
		int n = 5;
		int ans = Fibonacci_Number(n);
		System.out.println(ans);
	}

	public static int Fibonacci_Number(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return Fibonacci_Number(n - 1) + Fibonacci_Number(n - 2);
	}

}
