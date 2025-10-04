package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_Of_Two_Arrays_349 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		Intersection_Of_Two_Arrays(nums1, nums2);
	}

	public static int[] Intersection_Of_Two_Arrays(int[] nums1, int[] nums2) {
		List<Integer> temp = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				map.put(nums1[i], map.get(nums1[i]) + 1);
			} else {
				map.put(nums1[i], 1);
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0 && !temp.contains(nums2[i])) {
				temp.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int[] ans = new int[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			ans[i] = temp.get(i);
		}
		return ans;
	}
}
