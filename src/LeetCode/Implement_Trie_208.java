package LeetCode;
import java.util.*;

public class Implement_Trie_208 {

	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isTerminated;
	}

	private Node root;

	class Trie {

		public Trie() {
			root = new Node();
		}

		public void insert(String word) {
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
			curr.isTerminated = true;
		}

		public boolean search(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					return false;
				}
			}
			return curr.isTerminated;
		}

		public boolean startsWith(String prefix) {
			Node curr = root;
			for (int i = 0; i < prefix.length(); i++) {
				char ch = prefix.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					return false;
				}
			}
			return true;
		}
	}
}
