package LeetCode;

public class Path_Sum_112 {

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
		int targetSum = 22;
		return Path_Sum(root, targetSum);
	}

	public static boolean Path_Sum(TreeNode node, int targetSum) {
		if (node == null) {
			return false;
		}
		if (node.left == null && node.right == null) {
			return targetSum == node.val;
		}
		boolean left = Path_Sum(node.left, targetSum - node.val);
		boolean right = Path_Sum(node.right, targetSum - node.val);
		return left || right;
	}
	
}
