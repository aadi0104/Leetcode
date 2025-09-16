package LeetCode;

public class Search_In_A_Binary_Search_Tree_700 {

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

	public TreeNode main(String[] args) {
		TreeNode root = new TreeNode();
		int val = 2;
		return Search_In_A_Binary_Search_Tree(root, val);
	}

	public TreeNode Search_In_A_Binary_Search_Tree(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (root.val == val) {
			return root;
		}
		TreeNode l = Search_In_A_Binary_Search_Tree(root.left, val);
		TreeNode r = Search_In_A_Binary_Search_Tree(root.right, val);
		if (l != null) {
			return l;
		} else if (r != null) {
			return r;
		}
		return null;
	}
	
}
