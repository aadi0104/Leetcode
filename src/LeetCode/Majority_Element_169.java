package LeetCode;

public class Majority_Element_169 {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int ans = Majority_Element(nums);
		System.out.print(ans);
	}

	public static int Majority_Element(int[] nums) {
		int maxx = nums[0];
		int vote = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == maxx) {
				vote++;
			} else {
				vote--;
			}
			if (vote == 0) {
				maxx = nums[i];
				vote = 1;
			}
		}
		return maxx;
	}

}
