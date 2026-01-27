package LeetCode;

import java.util.*;

public class Lexicographical_Number_386 {

	public static void main(String[] args) {
		int n = 13;
		List<Integer> list = new ArrayList<>();
		Lexicographical_Number(n, 0, list);
		System.out.print(list);
	}

	public static void Lexicographical_Number(int n, int curr, List<Integer> list) {
		if (curr > n) {
			return;
		}
		if (curr != 0) {
			list.add(curr);
		}
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Lexicographical_Number(n, curr * 10 + i, list);
		}
	}
}