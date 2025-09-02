package LeetCode;

public class Diameter_Of_Binary_Tree_543 {

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
		return Diameter_Of_Binary_Tree(root).dia;
	}

//	public static int Diameter_Of_Binary_Tree(TreeNode root) {
//		if (root == null) {
//			return 0;
//		}
//		int l = Diameter_Of_Binary_Tree(root.left);
//		int r = Diameter_Of_Binary_Tree(root.right);
//		int maxheight = Height_Of_The_Tree(root.left) + Height_Of_The_Tree(root.right) + 2;
//		return Math.max(Math.max(l, r), maxheight);
//
//	}
//
//	public static int Height_Of_The_Tree(TreeNode root) {
//		if (root == null) {
//			return -1;
//		}
//		int l = Height_Of_The_Tree(root.left);
//		int r = Height_Of_The_Tree(root.right);
//		return Math.max(l, r) + 1;
//	}

//	More Optimised

	public DiaPair Diameter_Of_Binary_Tree(TreeNode root) {
		if (root == null) {
			return new DiaPair();
		}
		DiaPair l = Diameter_Of_Binary_Tree(root.left);
		DiaPair r = Diameter_Of_Binary_Tree(root.right);
		int currdia = l.ht + r.ht + 2;
		DiaPair curr = new DiaPair();
		curr.ht = Math.max(l.ht, r.ht) + 1;
		curr.dia = Math.max(Math.max(l.dia, r.dia), currdia);
		return curr;
	}

	class DiaPair {
		int ht = -1;
		int dia = 0;

	}
	
}
