package LeetCode;

import LeetCode.Linked_List_Cycle_141.ListNode;

public class Linked_List_Cycle_II_142 {

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
			val = 0;
			next = null;
		}

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode main(String[] args) {
		ListNode head = new ListNode();
		if (head == null || head.next == null) {
			return null;
		}
		return Linked_List_Cycle_II(head);
	}

	public static ListNode Linked_List_Cycle_II(ListNode head) {
		ListNode meet = Cycle_Detection(head);
		if (meet == null) {
			return null;
		}
		ListNode fast = meet;
		ListNode slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static ListNode Cycle_Detection(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return slow;
			}
		}
		return null;
	}

}
