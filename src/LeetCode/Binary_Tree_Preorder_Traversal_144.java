package LeetCode;

import java.util.*;

public class Binary_Tree_Preorder_Traversal_144 {

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

	public List<Integer> main(String[] args) {
		TreeNode root = new TreeNode();
		List<Integer> ans = new ArrayList<>();
		Binary_Tree_Preorder_Traversal(root, ans);
		return ans;
	}

	public static void Binary_Tree_Preorder_Traversal(TreeNode node, List<Integer> ans) {
		if (node == null) {
			return;
		}
		ans.add(node.val);
		Binary_Tree_Preorder_Traversal(node.left, ans);
		Binary_Tree_Preorder_Traversal(node.right, ans);
	}
	
}
