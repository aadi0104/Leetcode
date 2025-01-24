package LeetCode;

import java.util.*;

public class Maximum_Level_Sum_Of_A_Binary_Tree_1161 {

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
		return Maximum_Level_Sum_Of_A_Binary_Tree(root);
	}

	public static int Maximum_Level_Sum_Of_A_Binary_Tree(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		int minimum = Integer.MIN_VALUE;
		int row = 0;
		int curr = 0;
		while (!que.isEmpty()) {
			int size = que.size();
			int sum = 0;
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
			curr++;
			if(sum > minimum) {
				minimum = sum;
				row = curr;
			}
		}
		return row;
	}

}
