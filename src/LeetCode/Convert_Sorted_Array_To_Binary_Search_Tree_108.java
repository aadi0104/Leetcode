package LeetCode;

public class Convert_Sorted_Array_To_Binary_Search_Tree_108 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode main(String[] args) {
		int[] nums = { -10, -3, 0, 5, 9 };
		return Convert_Sorted_Array_To_Binary_Search_Tree(nums, 0, nums.length - 1);
	}

	public TreeNode Convert_Sorted_Array_To_Binary_Search_Tree(int[] nums, int st, int en) {
		if (st > en) {
			return null;
		}
		int mid = (st + en) / 2;
		TreeNode node = new TreeNode();
		node.val = nums[mid];
		node.left = Convert_Sorted_Array_To_Binary_Search_Tree(nums, st, mid - 1);
		node.right = Convert_Sorted_Array_To_Binary_Search_Tree(nums, mid + 1, en);
		return node;
	}
}