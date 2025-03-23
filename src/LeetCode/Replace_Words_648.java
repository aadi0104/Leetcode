package LeetCode;

import java.util.*;

public class Replace_Words_648 {

	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isTerminal;
	}

	private Node root;

	public Replace_Words_648() {
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
		curr.isTerminal = true;
	}

	public String Replace_Words(List<String> dictionary, String sentence) {
//		Node curr = root;
		for (int i = 0; i < dictionary.size(); i++) {
			insert(dictionary.get(i));
		}
		String[] str = sentence.split(" ");
		for (int i = 0; i < str.length; i++) {
			str[i] = startsWith(str[i]);
		}
		return String.join(" ", str);
	}

	public String startsWith(String prefix) {
		Node curr = root;
		StringBuilder rootWord = new StringBuilder();

		for (char ch : prefix.toCharArray()) {
			if (!curr.child.containsKey(ch)) {
				break;
			}
			curr = curr.child.get(ch);
			rootWord.append(ch);

			if (curr.isTerminal) {
				return rootWord.toString();
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
//		String[] dictionary = { "cat", "bat", "rat" };
		List<String> dictionary = new ArrayList<>();
		String sentence = "the cattle was rattled by the battery";
		Replace_Words_648 trie = new Replace_Words_648();
		String result = trie.Replace_Words(dictionary, sentence);
		System.out.println(result);
	}
	
}
