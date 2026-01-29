package LeetCode;
public class Maximum_Depth_Of_Binary_Tree_104 {

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

	public int main(String[] args) {
		TreeNode root = new TreeNode();
		return Maximum_Depth_Of_Binary_Tree(root);
	}

	public static int Maximum_Depth_Of_Binary_Tree(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int l = Maximum_Depth_Of_Binary_Tree(node.left);
		int r = Maximum_Depth_Of_Binary_Tree(node.right);
		return Math.max(l, r) + 1;
	}

}