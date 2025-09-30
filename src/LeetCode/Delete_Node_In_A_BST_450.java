package LeetCode;

public class Delete_Node_In_A_BST_450 {

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
		int key = 3;
		return Delete_Node_In_A_BST(root, key);
	}

	public TreeNode Delete_Node_In_A_BST(TreeNode root, int key) {
		if (root == null) {
			return null;
		}
		if (root.val < key) {
			root.right =  Delete_Node_In_A_BST(root.right, key);
		} else if (root.val > key) {
			root.left = Delete_Node_In_A_BST(root.left, key);
		} else {
			if (root.left == null || root.right == null) {
				return root.left == null ? root.right : root.left;
			} else {
				int m = min(root.right);
				root.right = Delete_Node_In_A_BST(root.right, m);
				root.val = m;
			}
		}
		return root;
	}

	public int min(TreeNode root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int r = min(root.left);
		return Math.min(root.val, r);
	}
}
