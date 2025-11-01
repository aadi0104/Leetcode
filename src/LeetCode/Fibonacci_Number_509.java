package LeetCode;

public class Fibonacci_Number_509 {

	public static void main(String[] args) {
		int n = 5;
//		int ans = Fibonacci_Number(n);
//		System.out.println(ans);
		
		int[] dp = new int[n + 1];
		int ans = Fibonacci_Number(n, dp);
		System.out.println(ans);
		
	}

//	public static int Fibonacci_Number(int n) {
//		if (n == 0 || n == 1) {
//			return n;
//		}
//		return Fibonacci_Number(n - 1) + Fibonacci_Number(n - 2);
//	}
	
	
//	Optimized using DP
	public static int Fibonacci_Number(int n, int[] dp) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		int f1 = Fibonacci_Number(n - 1, dp);
		int f2 = Fibonacci_Number(n - 2, dp);
		return dp[n] = f1 + f2;
	}

}
