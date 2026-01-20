package LeetCode;

public class Rotate_List_61 {

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
		int k = 2;
		if (head == null || k == 0 || head.next == null) {
			return head;
		}
		return Rotate_List(head, k);
	}

	public static ListNode Rotate_List(ListNode head, int k) {
		k %= Get_Length(head);
		if (k == 0) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		ListNode newhead = slow.next;
		fast.next = head;
		slow.next = null;
		return newhead;
	}

	public static int Get_Length(ListNode head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
}