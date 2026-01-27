package LeetCode;

import java.util.*;

public class Longest_Common_Prefix_14 {

	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isTerminal;
		int c = 1;
	}

	private Node root;

	public Longest_Common_Prefix_14() {
		root = new Node();
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		String ans = Longest_Common_Prefix(strs);
		System.out.print(ans);
	}

	public static String Longest_Common_Prefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		Longest_Common_Prefix_14 trie = new Longest_Common_Prefix_14();
		for (int i = 0; i < strs.length; i++) {
			trie.insert(strs[i]);
		}
		return trie.Common_Prifix();
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.c++;
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isTerminal = true;
	}

	public String Common_Prifix() {
		StringBuilder prefix = new StringBuilder();
		Node curr = root;
		while (curr.child.size() == 1 && !curr.isTerminal) {
			char ch = curr.child.keySet().iterator().next();
			curr = curr.child.get(ch);
			prefix.append(ch);
		}
		return prefix.toString();
	}
}