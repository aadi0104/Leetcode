package LeetCode;

public class Remove_Nth_Node_From_End_Of_List_19 {

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
		int n = 2;
		Remove_Nth_Node_From_End_Of_List(head, n);
	}

	public ListNode Remove_Nth_Node_From_End_Of_List(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy;
		ListNode slow = dummy;
		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		fast = slow.next;
		slow.next = slow.next.next;
		fast.next = null;
		return dummy.next;
	}

//	Using Stack

//	public static ListNode Remove_Nth_Node_From_End_Of_List(ListNode head, int n) {
//		int count = 1;
//		ListNode temp = head;
//		Stack<ListNode> st = new Stack<>();
//		while (temp != null) {
//			st.push(temp);
//			temp = temp.next;
//		}
//		head = null;
//		while (!st.isEmpty()) {
//			if (count == n) {
//				st.pop();
//			} else {
//				temp = st.pop();
//				temp.next = head;
//				head = temp;
//			}
//			count++;
//		}
//		return head;
//	}

}
