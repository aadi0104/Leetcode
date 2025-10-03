package LeetCode;

public class Invert_Binary_Tree_226 {

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
		return Invert_Binary_Tree(root);
	}

	public TreeNode Invert_Binary_Tree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode temp = Invert_Binary_Tree(root.left);
		root.left = Invert_Binary_Tree(root.right);
		root.right = temp;
		return root;
	}
}
