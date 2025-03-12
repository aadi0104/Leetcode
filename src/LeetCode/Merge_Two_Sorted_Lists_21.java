package LeetCode;

public class Merge_Two_Sorted_Lists_21 {

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
		ListNode list1 = new ListNode();
		ListNode list2 = new ListNode();
		Merge_Two_Sorted_Lists(list1, list2);
	}

	public ListNode Merge_Two_Sorted_Lists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				temp.next = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
			}
			temp = temp.next;
		}
		if (list1 != null) {
			temp.next = list1;
		}
		if (list2 != null) {
			temp.next = list2;
		}
		return dummy.next;
	}

}
