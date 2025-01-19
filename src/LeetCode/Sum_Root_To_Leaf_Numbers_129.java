package LeetCode;

import java.util.*;

public class Sum_Root_To_Leaf_Numbers_129 {
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

	public static int main(String[] args) {
		TreeNode root = new TreeNode();
		List<Integer> ll = new ArrayList<>();
		Sum_Root_To_Leaf_Numbers(root, 0, ll);
		int sum = 0;
		for (int i : ll) {
			sum += i;
		}
		return sum;
	}

	public static void Sum_Root_To_Leaf_Numbers(TreeNode node, int num, List<Integer> ll) {
		if (node == null) {
			return;
		}
		num *= 10;
		num += node.val;
		if (node.left == null && node.right == null) {
			ll.add(num);
			return;
		}
		Sum_Root_To_Leaf_Numbers(node.left, num, ll);
		Sum_Root_To_Leaf_Numbers(node.right, num, ll);
	}
	
}
