package LeetCode;

import java.util.*;

public class Average_Of_Levels_In_Binary_Tree_637 {

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

	public List<Double> main(String[] args) {
		TreeNode root = new TreeNode();
		return Average_Of_Levels_In_Binary_Tree(root);
	}

	public static List<Double> Average_Of_Levels_In_Binary_Tree(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<>();
		List<Double> ans = new ArrayList<>();
		if (root == null) {
			return ans;
		}
		que.add(root);
		while (!que.isEmpty()) {
			int size = que.size();
			double sum = 0;
			for (int i = 0; i < size; i++) {
				TreeNode peek = que.poll();
				sum += peek.val;
				if (peek.left != null) {
					que.add(peek.left);
				}
				if (peek.right != null) {
					que.add(peek.right);
				}
			}
			double avg = sum / size;
			ans.add(avg);
		}
		return ans;
	}

}
