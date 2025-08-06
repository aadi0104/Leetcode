package LeetCode;

import java.util.*;

public class Find_Largest_Value_In_Each_Tree_Row_515 {

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
		return Find_Largest_Value_In_Each_Tree_Row(root);
	}

	public List<Integer> Find_Largest_Value_In_Each_Tree_Row(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		while (!que.isEmpty()) {
			int size = que.size();
			int maxx = Integer.MIN_VALUE;
			for (int times = 0; times < size; times++) {
				TreeNode peek = que.poll();
				maxx = Math.max(maxx, peek.val);
				if (peek.left != null) {
					que.add(peek.left);
				}
				if (peek.right != null) {
					que.add(peek.right);
				}
			}
			ans.add(maxx);
		}
		return ans;
	}
	
}
