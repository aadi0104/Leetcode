package LeetCode;

import java.util.*;

public class Path_Sum_II_113 {

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

	public List<List<Integer>> main(String[] args) {
		TreeNode root = new TreeNode();
		int targetSum = 22;
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Path_Sum_II(root, targetSum, temp, ans);
		return ans;
	}

	public static void Path_Sum_II(TreeNode node, int targetSum, List<Integer> temp, List<List<Integer>> ans) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (node.val == targetSum) {
				temp.add(node.val);
				ans.add(new ArrayList<>(temp));
				temp.remove(temp.size() - 1);
				return;
			}
		}
		temp.add(node.val);
		Path_Sum_II(node.left, targetSum - node.val, temp, ans);
		Path_Sum_II(node.right, targetSum - node.val, temp, ans);
		temp.remove(temp.size() - 1);
	}

}
