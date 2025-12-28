package LeetCode;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal_II_107 {

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
		return Binary_Tree_Level_Order_Traversal_II(root);
	}

	public static List<List<Integer>> Binary_Tree_Level_Order_Traversal_II(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<>();
		List<List<Integer>> ans = new ArrayList<>();
		if (root == null) {
			return ans;
		}
        que.add(root);
		while (!que.isEmpty()) {
			List<Integer> temp = new ArrayList<>();
			int size = que.size();
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
			ans.add(0, temp);
		}

		return ans;
	}

}