package LeetCode;

import java.util.*;

public class Graph_Valid_Tree_261 {

	public static void main(String[] args) {
		int n = 5;
		int[][] edges = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 } };
		boolean ans = Graph_Valid_Tree(n, edges);
		System.out.print(ans);
	}

	public static boolean Graph_Valid_Tree(int n, int[][] edges) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < edges.length; i++) {
			int v1 = edges[i][0];
			int v2 = edges[i][1];
			map.get(v1).add(v2);
			map.get(v2).add(v1);
		}
		return BFT(map);
	}

	public static boolean BFT(HashMap<Integer, List<Integer>> map) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int c = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			c++;
			while (!q.isEmpty()) {
				// 1. Remove
				int rv = q.poll();
				// 2. Ignore
				if (visited.contains(rv)) {
					return false;
				}
				// 3. Mark Visited
				visited.add(rv);
				// 4. Self Work

				// 5. Add Neighbors
				for (int nbrs : map.get(rv)) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return c == 1;
	}
	
}
