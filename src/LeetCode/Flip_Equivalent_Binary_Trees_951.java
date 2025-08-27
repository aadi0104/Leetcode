package LeetCode;

public class Flip_Equivalent_Binary_Trees_951 {

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
		TreeNode root1 = new TreeNode();
		TreeNode root2 = new TreeNode();
		return Flip_Equivalent_Binary_Trees(root1, root2);
	}

	public static boolean Flip_Equivalent_Binary_Trees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		boolean flip = Flip_Equivalent_Binary_Trees(root1.right, root2.left)
				&& Flip_Equivalent_Binary_Trees(root1.left, root2.right);
		boolean equal = Flip_Equivalent_Binary_Trees(root1.left, root2.left)
				&& Flip_Equivalent_Binary_Trees(root1.right, root2.right);

		return flip || equal;
	}
	
}
