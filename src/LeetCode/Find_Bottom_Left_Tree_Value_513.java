package LeetCode;

public class Find_Bottom_Left_Tree_Value_513 {

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

	int maxdepth = 0;
	int ans;

	public int main(String[] args) {
		TreeNode root = new TreeNode();
		ans = root.val;
		Find_Bottom_Left_Tree_Value(root, 1);
		return ans;
	}

	public void Find_Bottom_Left_Tree_Value(TreeNode root, int currdepth) {
		if (root == null) {
			return;
		}
		Find_Bottom_Left_Tree_Value(root.left, currdepth + 1);
		Find_Bottom_Left_Tree_Value(root.right, currdepth + 1);
		if (currdepth > maxdepth) {
			maxdepth = currdepth;
			ans = root.val;
		}
	}
	
}
