package LeetCode;

public class Construct_String_From_Binary_Tree_606 {

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

	public String ans = "";

	public String main(String[] args) {
		TreeNode root = new TreeNode();
		Construct_String_From_Binary_Tree(root);
		return ans.substring(1, ans.length() - 1);
	}

	public void Construct_String_From_Binary_Tree(TreeNode node) {
		if (node == null) {
			return;
		}
		ans += "(" + node.val;
        if (node.left == null && node.right != null) {
			ans += "()";
		}
		Construct_String_From_Binary_Tree(node.left);
		Construct_String_From_Binary_Tree(node.right);
		ans += ")";
	}
	
}
