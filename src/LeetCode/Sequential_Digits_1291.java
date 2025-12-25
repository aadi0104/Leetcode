package LeetCode;

import java.util.*;

public class Sequential_Digits_1291 {

	public static void main(String[] args) {
		int low = 1000;
		int high = 13000;
		List<Integer> ll = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			Sequential_Digits(low, high, 0, i, ll);
		}
		Collections.sort(ll);
		System.out.print(ll);
	}

	public static void Sequential_Digits(int low, int high, int ans, int num, List<Integer> ll) {
		if (ans >= low && ans <= high) {
			ll.add(ans);
		}
		if (ans > high || num > 9) {
			return;
		}
		ans *= 10;
		ans += num;
		Sequential_Digits(low, high, ans, num + 1, ll);
	}

}