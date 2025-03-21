package LeetCode;

public class Count_Complete_Tree_Nodes_222 {

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

	public int count = 0;

	public int main(String[] args) {
		TreeNode root = new TreeNode();
		Count_Complete_Tree_Nodes(root);
		return count;
	}

	public void Count_Complete_Tree_Nodes(TreeNode node) {
		if (node == null) {
			return;
		}
		count++;
		Count_Complete_Tree_Nodes(node.left);
		Count_Complete_Tree_Nodes(node.right);
	}
	
}
