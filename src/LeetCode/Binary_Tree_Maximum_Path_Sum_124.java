 package LeetCode;

public class Binary_Tree_Maximum_Path_Sum_124 {

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

	int ans = Integer.MIN_VALUE;

	public int main(String[] args) {
		TreeNode root = new TreeNode();
//		return Binary_Tree_Maximum_Path_Sum(root).ans;
		Binary_Tree_Maximum_Path_Sum(root);
		return ans;
	}

//	public Pair Binary_Tree_Maximum_Path_Sum(TreeNode root) {
//		if (root == null) {
//			return new Pair();
//		}
//		Pair l = Binary_Tree_Maximum_Path_Sum(root.left);
//		Pair r = Binary_Tree_Maximum_Path_Sum(root.right);
//		Pair curr = new Pair();
//		int totalsum = l.sum + r.sum + root.val;
//		curr.sum = Math.max(0, Math.max(l.sum, r.sum)) + root.val;
//		curr.ans = Math.max(Math.max(l.ans, r.ans), Math.max(totalsum, curr.sum));
//		return curr;
//	}
//
//	class Pair {
//		int sum = 0;
//		int ans = Integer.MIN_VALUE;
//	}

	public int Binary_Tree_Maximum_Path_Sum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int l = Math.max(Binary_Tree_Maximum_Path_Sum(root.left), 0);
		int r = Math.max(Binary_Tree_Maximum_Path_Sum(root.right), 0);
		int temp = l + r + root.val;
		ans = Math.max(ans, temp);
		return root.val + Math.max(l, r);
	}

}
