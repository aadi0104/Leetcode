package LeetCode;

public class Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal_106 {

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
		int[] inorder = { 9, 3, 15, 20, 7 };
		int[] postorder = { 9, 15, 7, 20, 3 };
		return Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal(int[] inorder, int[] postorder, int inst, int inen, int posst, int posen) {
        if (inst > inen || posst > posen) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[posen]);
        int idx = Search(inorder, inst, inen, node.val);
        int sublen = idx - inst;
        node.left = Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal(inorder, postorder, inst, idx - 1, posst, posst + sublen - 1);
        node.right = Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal(inorder, postorder, idx + 1, inen, posst + sublen, posen - 1);
        return node;
    }

    private int Search(int[] inorder, int start, int end, int item) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == item) {
                return i;
            }
        }
        return -1;
    }
    
}
