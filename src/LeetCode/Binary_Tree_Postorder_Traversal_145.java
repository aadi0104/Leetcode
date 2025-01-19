package LeetCode;

import java.util.*;

public class Binary_Tree_Postorder_Traversal_145 {

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

	public static List<Integer> main(String[] args) {
		TreeNode root = new TreeNode();
		List<Integer> ans = new ArrayList<>();
		Binary_Tree_Postorder_Traversal(root, ans);
		return ans;
	}

	public static void Binary_Tree_Postorder_Traversal(TreeNode node, List<Integer> ans) {
		if (node == null) {
			return;
		}
		Binary_Tree_Postorder_Traversal(node.left, ans);
		Binary_Tree_Postorder_Traversal(node.right, ans);
		ans.add(node.val);
	}

}
