package LeetCode;

import java.util.*;

public class Palindrome_Linked_List_234 {

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

	public static void main(String[] args) {
		ListNode head = new ListNode();
		Palindrome_Linked_List(head);
	}

	public static boolean Palindrome_Linked_List(ListNode head) {
		ListNode temp = head;
		Stack<Integer> st = new Stack<>();
		while (temp != null) {
			st.push(temp.val);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			if (st.pop() != temp.val) {
				return false;
			}
			temp = temp.next;
		}
		return true;
	}
	
}
