package LeetCode;

public class Lowest_Common_Ancestor_Of_A_Binary_Tree_236 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		TreeNode() {
			val = 0;
		}
	}

	public TreeNode main(String[] args) {
		TreeNode root = new TreeNode();
		TreeNode p = new TreeNode();
		TreeNode q = new TreeNode();
		return Lowest_Common_Ancestor_Of_A_Binary_Tree(root, p, q);
	}

	public TreeNode Lowest_Common_Ancestor_Of_A_Binary_Tree(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if (root == p || root == q) {
			return root;
		}
		TreeNode l = Lowest_Common_Ancestor_Of_A_Binary_Tree(root.left, p, q);
		TreeNode r = Lowest_Common_Ancestor_Of_A_Binary_Tree(root.right, p, q);
		if (l != null && r != null) {
			return root;
		} else if (l != null) {
			return l;
		} else {
			return r;
		}
	}

}