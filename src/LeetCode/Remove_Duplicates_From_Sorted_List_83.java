package LeetCode;

public class Remove_Duplicates_From_Sorted_List_83 {

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
		return Remove_Duplicates_From_Sorted_List(head);
	}

	public static ListNode Remove_Duplicates_From_Sorted_List(ListNode head) {
		ListNode temp = head;
		if (temp == null) {
			return temp;
		}
		while (temp != null) {
			if (temp.next != null) {
				if (temp.val == temp.next.val) {
					temp.next = temp.next.next;
				} else {
					temp = temp.next;
				}
			} else {
				break;
			}
		}
		return head;
	}

}
