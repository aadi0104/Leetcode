package LeetCode;

import java.util.*;

public class Binary_Tree_Paths_257 {

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

	public List<String> main(String[] args) {
		TreeNode root = new TreeNode();
		List<String> ans = new ArrayList<>();
		Binary_Tree_Paths(root, "", ans);
		return ans;
	}

	public static void Binary_Tree_Paths(TreeNode node, String temp, List<String> ans) {
		if (node == null) {
			return;
		}
		temp += node.val;
		if (node.left == null && node.right == null) {
			ans.add(temp);
			return;
		}
		Binary_Tree_Paths(node.left, temp + "->", ans);
		Binary_Tree_Paths(node.right, temp + "->", ans);
	}
	
}
