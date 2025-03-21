package LeetCode;

public class Balanced_Binary_Tree_110 {

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
		return Balanced_Binary_Tree(root).isbalanced;
	}

	public Check Balanced_Binary_Tree(TreeNode root) {
		if (root == null) {
			return new Check();
		}
		Check l = Balanced_Binary_Tree(root.left);
		Check r = Balanced_Binary_Tree(root.right);
		Check curr = new Check();
		curr.ht = Math.max(l.ht, r.ht) + 1;
		curr.isbalanced = l.isbalanced && r.isbalanced && (l.ht - r.ht >= -1 && l.ht - r.ht <= 1);
		return curr;
	}

	class Check {
		boolean isbalanced = true;
		int ht = 0;
	}
	
}
