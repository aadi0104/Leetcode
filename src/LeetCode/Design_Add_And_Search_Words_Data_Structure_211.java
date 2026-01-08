package LeetCode;

import java.util.*;

public class Design_Add_And_Search_Words_Data_Structure_211 {

	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isTerminal;
	}

	private Node root;

	public Design_Add_And_Search_Words_Data_Structure_211() {
		root = new Node();
	}

	public void addWord(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isTerminal = true;
	}

	public boolean search(String word) {
		return searchHelper(word, 0, root);
	}

	private boolean searchHelper(String word, int index, Node curr) {
		if (index == word.length()) {
			return curr.isTerminal;
		}
		char ch = word.charAt(index);
		if (ch == '.') {
			for (Node child : curr.child.values()) {
				if (searchHelper(word, index + 1, child)) {
					return true;
				}
			}
			return false;
		} else {
			if (!curr.child.containsKey(ch)) {
				return false;
			}
			return searchHelper(word, index + 1, curr.child.get(ch));
		}
	}

}