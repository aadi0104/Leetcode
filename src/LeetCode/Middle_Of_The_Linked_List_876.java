package LeetCode;

public class Middle_Of_The_Linked_List_876 {

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

	public void main(String[] args) {
		ListNode head = new ListNode();
		Middle_Of_The_Linked_List(head);
	}

	public static ListNode Middle_Of_The_Linked_List(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
}
