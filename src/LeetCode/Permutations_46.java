package LeetCode;

import java.util.*;

public class Permutations_46 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Permutations(nums, temp, ans);
		System.out.println(ans);
	}

	public static void Permutations(int[] arr, List<Integer> temp, List<List<Integer>> ans) {
		if (temp.size() == arr.length) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (temp.contains(arr[i]) == false) {
				temp.add(arr[i]);
				Permutations(arr, temp, ans);
				temp.remove(temp.size() - 1);
			}
		}
	}

}
