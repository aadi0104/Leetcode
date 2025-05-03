package LeetCode;

import java.util.*;

public class Binary_Tree_Right_Side_View_199 {

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

	public int maxdepth = 0;

	public List<Integer> main(String[] args) {
		TreeNode root = new TreeNode();
		List<Integer> ans = new ArrayList<>();
		Binary_Tree_Right_Side_View(root, 1, ans);
		return ans;
	}

	public void Binary_Tree_Right_Side_View(TreeNode root, int currdepth, List<Integer> ans) {
		if (root == null) {
			return;
		}
		if (currdepth > maxdepth) {
			ans.add(root.val);
			maxdepth = currdepth;
		}
		Binary_Tree_Right_Side_View(root.right, currdepth + 1, ans);
		Binary_Tree_Right_Side_View(root.left, currdepth + 1, ans);
	}
	
}
