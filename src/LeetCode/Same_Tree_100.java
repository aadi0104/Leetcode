package LeetCode;

public class Same_Tree_100 {

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

	public static boolean main(String[] args) {
		TreeNode p = new TreeNode();
		TreeNode q = new TreeNode();
		return Same_Tree(p, q);
	}

	public static boolean Same_Tree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null && q != null) {
			return false;
		}
		if (q == null && p != null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}
		boolean l = Same_Tree(p.left, q.left);
		boolean r = Same_Tree(p.right, q.right);

		return l && r;
	}

}
