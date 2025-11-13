package LeetCode;

public class Insert_Into_A_Binary_Search_Tree_701 {

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
		int val = 5;
		return Insert_Into_A_Binary_Search_Tree(root, val);
	}

	public TreeNode Insert_Into_A_Binary_Search_Tree(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (root.val > val) {
			root.left = Insert_Into_A_Binary_Search_Tree(root.left, val);
		} else {
			root.right = Insert_Into_A_Binary_Search_Tree(root.right, val);
		}
		return root;
	}

}
