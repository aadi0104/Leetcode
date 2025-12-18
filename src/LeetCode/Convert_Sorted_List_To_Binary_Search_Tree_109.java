package LeetCode;

public class Convert_Sorted_List_To_Binary_Search_Tree_109 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

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
		ListNode head = new ListNode();
		return Convert_Sorted_List_To_Binary_Search_Tree(head, null);
	}

	public TreeNode Convert_Sorted_List_To_Binary_Search_Tree(ListNode head, ListNode tail) {
		if (head == tail) {
			return null;
		}
		ListNode mid = Middle_Of_LinkedList(head, tail);
		TreeNode node = new TreeNode(mid.val);
		node.left = Convert_Sorted_List_To_Binary_Search_Tree(head, mid);
		node.right = Convert_Sorted_List_To_Binary_Search_Tree(mid.next, tail);
		return node;
	}

	public ListNode Middle_Of_LinkedList(ListNode start, ListNode end) {
		ListNode slow = start;
		ListNode fast = start;
		while (fast != end && fast.next != end) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}