package LeetCode;

public class Sum_Of_Left_Leaves_404 {

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

	public static int main(String[] args) {
		TreeNode root = new TreeNode();
		return Sum_Of_Left_Leaves(root, false);
	}

	public static int Sum_Of_Left_Leaves(TreeNode node, boolean ln) {
		if (node == null) {
			return 0;
		}
		int l = Sum_Of_Left_Leaves(node.left, true);
		int r = Sum_Of_Left_Leaves(node.right, false);
		if (ln && node.left == null && node.right == null) {
			return l + r + node.val;
		}else {
			return l + r;
		}
	}

}
