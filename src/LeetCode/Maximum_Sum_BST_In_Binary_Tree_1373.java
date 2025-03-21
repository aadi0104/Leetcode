package LeetCode;

public class Maximum_Sum_BST_In_Binary_Tree_1373 {

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
		return Maximum_Sum_BST_In_Binary_Tree(root).ans;
	}

	public Pairs Maximum_Sum_BST_In_Binary_Tree(TreeNode root) {
		if (root == null) {
			return new Pairs();
		}
		Pairs l = Maximum_Sum_BST_In_Binary_Tree(root.left);
		Pairs r = Maximum_Sum_BST_In_Binary_Tree(root.right);
		Pairs curr = new Pairs();
		curr.min = Math.min(Math.min(l.min, r.min), root.val);
		curr.max = Math.max(Math.max(l.max, r.max), root.val);
		curr.sum = l.sum + r.sum + root.val;
		curr.isbst = l.isbst && r.isbst && l.max < root.val && root.val < r.min;
		if (curr.isbst) {
			curr.ans = Math.max(Math.max(l.ans, r.ans), curr.sum);
		} else {
			curr.ans = Math.max(l.ans, r.ans);
		}
		return curr;
	}

	class Pairs {
		boolean isbst = true;
		int sum = 0;
		int ans = 0;
		Long min = Long.MAX_VALUE;
		Long max = Long.MIN_VALUE;
	}

}
