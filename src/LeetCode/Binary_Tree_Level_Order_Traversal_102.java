package LeetCode;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal_102 {

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

	public static List<List<Integer>> main(String[] args) {
		TreeNode root = new TreeNode();
		return Binary_Tree_Level_Order_Traversal(root);
	}

	public static List<List<Integer>> Binary_Tree_Level_Order_Traversal(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if (root == null) {
			return ans;
		}

		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);

		while (!que.isEmpty()) {
			int size = que.size();
			List<Integer> temp = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode peek = que.poll();
				temp.add(peek.val);
				if (peek.left != null) {
					que.add(peek.left);
				}
				if (peek.right != null) {
					que.add(peek.right);
				}
			}
			ans.add(temp);
		}
		return ans;
	}

}
