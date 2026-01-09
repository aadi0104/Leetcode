package LeetCode;

public class Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal_105 {

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
		int[] preorder = { 3, 9, 20, 15, 7 };
		int[] inorder = { 9, 3, 15, 20, 7 };
		return Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal(preorder, inorder, 0, inorder.length - 1, 0,
				preorder.length - 1);
	}

	public TreeNode Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal(int[] preorder, int[] inorder, int inlow,
			int inhigh, int prelow, int prehigh) {
		if (inlow > inhigh || prelow > prehigh) {
			return null;
		}
		TreeNode node = new TreeNode(preorder[prelow]);
		int idx = Search(inorder, inlow, inhigh, preorder[prelow]);
		int c = idx - inlow;
		node.left = Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal(preorder, inorder, inlow, idx - 1,
				prelow + 1, prelow + c);
		node.right = Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal(preorder, inorder, idx + 1, inhigh,
				prelow + c + 1, prehigh);
		return node;
	}

	public int Search(int[] inorder, int inlow, int inhigh, int item) {
		for (int i = inlow; i <= inhigh; i++) {
			if (inorder[i] == item) {
				return i;
			}
		}
		return -1;
	}
}