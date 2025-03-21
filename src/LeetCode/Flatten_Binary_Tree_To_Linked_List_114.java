package LeetCode;

public class Flatten_Binary_Tree_To_Linked_List_114 {
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

	public void main(String[] args) {
		TreeNode root = new TreeNode();
//		Queue<TreeNode> que = new LinkedList<>();
//		Flatten_Binary_Tree_To_Linked_List(root, que);
//		Make_List_From_Queue(que);
		Flatten_Binary_Tree_To_Linked_List(root);
	}

//	public void Flatten_Binary_Tree_To_Linked_List(TreeNode root, Queue<TreeNode> que) {
//		if (root == null) {
//			return;
//		}
//		que.add(root);
//		Flatten_Binary_Tree_To_Linked_List(root.left, que);
//		Flatten_Binary_Tree_To_Linked_List(root.right, que);
//	}
//
//	public void Make_List_From_Queue(Queue<TreeNode> que) {
//		TreeNode temp = que.poll();
//		while (!que.isEmpty()) {
//			temp.left = null;
//			temp.right = que.poll();
//			temp = temp.right;
//		}
//	}

//	Optimised

	public TreeNode Flatten_Binary_Tree_To_Linked_List(TreeNode root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return root;
		}
		TreeNode l = Flatten_Binary_Tree_To_Linked_List(root.left);
		TreeNode r = Flatten_Binary_Tree_To_Linked_List(root.right);
		if(l != null) {
			l.right = root.right;
			root.right = root.left;
	        root.left = null;
		}
		return r != null ? r : l;
	}
	
}
