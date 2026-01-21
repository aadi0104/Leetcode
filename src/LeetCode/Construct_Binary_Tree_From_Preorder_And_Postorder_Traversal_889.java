package LeetCode;

public class Construct_Binary_Tree_From_Preorder_And_Postorder_Traversal_889 {

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
		int[] postorder = { 4, 5, 2, 6, 7, 3, 1 };
		return Construct_Binary_Tree_From_Preorder_And_Postorder_Traversal(preorder, postorder, 0, postorder.length - 1,
				0, preorder.length - 1);
	}

	public TreeNode Construct_Binary_Tree_From_Preorder_And_Postorder_Traversal(int[] preorder, int[] postorder,
			int postlow, int posthigh, int prelow, int prehigh) {

		if (prelow > prehigh || postlow > posthigh) {
			return null;
		}

		TreeNode node = new TreeNode(preorder[prelow]);
		if (prelow == prehigh) {
			return node;
		}
		int leftRootIndex = Search(postorder, postlow, posthigh, preorder[prelow + 1]);
		int leftSize = leftRootIndex - postlow + 1;
		node.left = Construct_Binary_Tree_From_Preorder_And_Postorder_Traversal(preorder, postorder, postlow,
				leftRootIndex, prelow + 1, prelow + leftSize);

		node.right = Construct_Binary_Tree_From_Preorder_And_Postorder_Traversal(preorder, postorder, leftRootIndex + 1,
				posthigh - 1, prelow + leftSize + 1, prehigh);

		return node;
	}

	public int Search(int[] postorder, int low, int high, int item) {
		for (int i = low; i <= high; i++) {
			if (postorder[i] == item) {
				return i;
			}
		}
		return -1;
	}
}