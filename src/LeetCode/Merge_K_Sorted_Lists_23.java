package LeetCode;

import java.util.*;

public class Merge_K_Sorted_Lists_23 {

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
		ListNode[] lists = new ListNode[10];
		return Merge_K_Sorted_Lists(lists);
	}

	public ListNode Merge_K_Sorted_Lists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});
		for (int i = 0; i < lists.length; i++) {
			pq.add(lists[i]);
		}
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		while (!pq.isEmpty()) {
			ListNode node = pq.poll();
			temp.next = node;
			temp = temp.next;
			if (temp.next != null) {
				pq.add(temp.next);
			}
		}
		return dummy.next;
	}
}
