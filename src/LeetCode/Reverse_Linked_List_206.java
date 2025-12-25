package LeetCode;

public class Reverse_Linked_List_206 {
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

	public ListNode main(String[] args) {
		ListNode head = new ListNode();
		return Reverse_Linked_List(head);
	}

	public static ListNode Reverse_Linked_List(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newhead = Reverse_Linked_List(head.next);
		AddEnd(head);
		return newhead;
	}

	public static void AddEnd(ListNode head) {
		ListNode front = head.next;
		front.next = head;
		head.next = null;
	}
}