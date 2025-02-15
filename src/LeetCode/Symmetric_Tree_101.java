package LeetCode;

public class Symmetric_Tree_101 {

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
		return Symmetric_Tree(root.left, root.right);
	}

	public static boolean Symmetric_Tree(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}

		if (t1 == null || t2 == null) {
			return false;
		}

		if (t1.val != t2.val) {
			return false;
		}

		boolean l = Symmetric_Tree(t1.left, t2.right);
		boolean r = Symmetric_Tree(t1.right, t2.left);
		return l && r;
	}
	
}
