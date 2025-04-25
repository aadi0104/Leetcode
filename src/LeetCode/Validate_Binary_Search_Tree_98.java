package LeetCode;

public class Validate_Binary_Search_Tree_98 {

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
		return Validate_Binary_Search_Tree(root).isbst;
	}

	public Pair Validate_Binary_Search_Tree(TreeNode root) {
		if (root == null) {
			return new Pair();
		}
		Pair l = Validate_Binary_Search_Tree(root.left);
		Pair r = Validate_Binary_Search_Tree(root.right);
		Pair curr = new Pair();
		curr.max = Math.max(root.val, Math.max(l.max, r.max));
		curr.min = Math.min(root.val, Math.min(l.min, r.min));
		curr.isbst = l.isbst && r.isbst && l.max < root.val && r.min > root.val;
        return curr;
	}

	class Pair {
		boolean isbst = true;
		Long min = Long.MAX_VALUE;
		Long max = Long.MIN_VALUE;
	}
	
}
