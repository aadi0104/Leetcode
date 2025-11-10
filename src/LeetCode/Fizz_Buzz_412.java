package LeetCode;

import java.util.*;

public class Fizz_Buzz_412 {

	public static void main(String[] args) {
		int n = 15;
		List<String> list = Fizz_Buzz(n);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
	}

	public static List<String> Fizz_Buzz(int n) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(Integer.toString(i));
			}
		}
		return list;
	}
}
