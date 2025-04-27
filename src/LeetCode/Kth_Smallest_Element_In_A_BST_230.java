package LeetCode;

public class Kth_Smallest_Element_In_A_BST_230 {

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

	int depth = -1;
	int ans = 0;

	public int main(String[] args) {
		TreeNode root = new TreeNode();
		int k = 1;
		Kth_Smallest_Element_In_A_BST(root, k);
		return ans;
	}

	public void Kth_Smallest_Element_In_A_BST(TreeNode root, int k) {
		if (root == null) {
			return;
		}
		Kth_Smallest_Element_In_A_BST(root.left, k);
		depth++;
		if (depth == k) {
			ans = root.val;
		}
		Kth_Smallest_Element_In_A_BST(root.right, k);
	}
	
}
