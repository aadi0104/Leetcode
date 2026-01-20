package LeetCode;

public class Sum_Root_To_Leaf_Numbers_129 {
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
//		List<Integer> ll = new ArrayList<>();
//		int sum = 0;
//		for (int i : ll) {
//			sum += i;
//		}
//		return sum;
		return Sum_Root_To_Leaf_Numbers(root, 0);
	}

//	public static void Sum_Root_To_Leaf_Numbers(TreeNode node, int num, List<Integer> ll) {
//		if (node == null) {
//			return;
//		}
//		num *= 10;
//		num += node.val;
//		if (node.left == null && node.right == null) {
//			ll.add(num);
//			return;
//		Sum_Root_To_Leaf_Numbers(node.left, num, ll);
//		Sum_Root_To_Leaf_Numbers(node.right, num, ll);
//	}

	public static int Sum_Root_To_Leaf_Numbers(TreeNode node, int num) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return num * 10 + node.val;
		}
		int l = Sum_Root_To_Leaf_Numbers(node.left, num * 10 + node.val);
		int r = Sum_Root_To_Leaf_Numbers(node.right, num * 10 + node.val);
		return l + r;
	}

}