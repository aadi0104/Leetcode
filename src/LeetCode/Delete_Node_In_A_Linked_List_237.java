package LeetCode;

public class Delete_Node_In_A_Linked_List_237 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public void main(String[] args) {
		ListNode node = new ListNode(1);
		Delete_Node_In_A_Linked_List(node);
	}

	public static void Delete_Node_In_A_Linked_List(ListNode node) {
		while (node.next != null) {
			node.val = node.next.val;
			if (node.next.next != null) {
				node = node.next;
			} else {
				node.next = null;
			}
		}
	}

}
