package LeetCode;

public class Sort_List_148 {

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
		return Sort_List(head);
	}

	public ListNode Sort_List(ListNode head) {
//		if (head != null || head.next != null) {
//			return head;
//		}
		ListNode mid = Middle_Of_The_List(head);
		ListNode head2 = mid.next;
		mid.next = null;
		ListNode A = Sort_List(head);
		ListNode B = Sort_List(head2);
		return Merge_List(A, B);
	}

	public ListNode Merge_List(ListNode A, ListNode B) {
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		while (A != null && B != null) {
			if (A.val < B.val) {
				temp.next = A;
				A = A.next;
			} else {
				temp.next = B;
				B = B.next;
			}
			temp = temp.next;
		}
		if (A != null) {
			temp.next = A;
		}
		if (B != null) {
			temp.next = B;
		}
		return dummy.next;
	}

	public ListNode Middle_Of_The_List(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
