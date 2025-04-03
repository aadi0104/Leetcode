package LeetCode;

import java.util.*;

public class Binary_Tree_Inorder_Traversal_94 {

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

	public void main(String[] args) {
		TreeNode root = new TreeNode();
		List<Integer> ans = new ArrayList<>();
		Binary_Tree_Inorder_Traversal(root, ans);
	}

	public static void Binary_Tree_Inorder_Traversal(TreeNode node, List<Integer> ans) {
		if (node == null) {
			return;
		}
		Binary_Tree_Inorder_Traversal(node.left, ans);
		ans.add(node.val);
		Binary_Tree_Inorder_Traversal(node.right, ans);
	}

}
