package LeetCode;

import java.util.*;

public class Even_Odd_Tree_1609 {

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

	public boolean main(String[] args) {
		TreeNode root = new TreeNode();
		return Even_Odd_Tree(root);
	}

	public boolean Even_Odd_Tree(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<>();
		if (root == null) {
			return false;
		}
		que.add(root);
		boolean isEven = true;
		while (!que.isEmpty()) {
			int size = que.size();
			int prev = isEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			for (int i = 0; i < size; i++) {
				TreeNode temp = que.poll();
				if ((isEven && (temp.val % 2 == 0 || temp.val <= prev))
						|| (!isEven && (temp.val % 2 != 0 || temp.val >= prev))) {
					return false;
				}
				prev = temp.val;
				if (temp.left != null) {
					que.add(temp.left);
				}
				if (temp.right != null) {
					que.add(temp.right);
				}
			}
			isEven = !isEven;
		}
		return true;
	}
}
