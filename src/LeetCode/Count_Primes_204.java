package LeetCode;

public class Count_Primes_204 {

	public static void main(String[] args) {
		int n = 10;
		System.out.print(Count_Primes(n));
	}

	public static int Count_Primes(int n) {
		if (n == 0 || n == 1) {
			return 0;
		}
		int[] prime = new int[n];
		prime[0] = prime[1] = 1;
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == 0) {
				for (int j = 2; i * j < n; j++) {
					prime[i * j] = 1;
				}
			}
		}

		int count = 0;
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == 0) {
				count++;
			}
		}
		return count;
	}
}
