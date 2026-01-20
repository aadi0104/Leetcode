package LeetCode;

public class Root_Equals_Sum_Of_Children_2236 {

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
		int ans = Root_Equals_Sum_Of_Children(root);
		return (ans - root.val) == root.val;
	}

	public static int Root_Equals_Sum_Of_Children(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int l = Root_Equals_Sum_Of_Children(node.left);
		int r = Root_Equals_Sum_Of_Children(node.right);
		return l + r + node.val;
	}
}
