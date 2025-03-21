package LeetCode;

public class Counting_Bits_338 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n + 1];
		Counting_Bits(n, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Counting_Bits(int n, int[] arr) {
		for (int i = 1; i <= n; i++) {
			int idx = i;
			int cnt = 0;
			while (idx > 0) {
				idx = (idx & (idx - 1));
				cnt++;
			}
			arr[i] = cnt;
		}
	}
	
}
