package LeetCode;

import java.util.*;

public class Is_Graph_Bipartite_785 {

	public static void main(String[] args) {
		int[][] graph = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };
		Is_Graph_Bipartite(graph);
	}

	public static boolean Is_Graph_Bipartite(int[][] graph) {
		Queue<BipartitePairs> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();
		for (int vtx = 0; vtx < graph.length; vtx++) {
			if (visited.containsKey(vtx)) {
				continue;
			}
			q.add(new BipartitePairs(vtx, 0));
			while (!q.isEmpty()) {
				// 1. Remove
				BipartitePairs rp = q.poll();
				// 2. Ignore
				if (visited.containsKey(rp.vtx)) {
					if (visited.get(rp.vtx) != rp.dis) {
						return false;
					}
					continue;
				}
				// 3. Mark Visited
				visited.put(rp.vtx, rp.dis);
				// 5. Add NBRS
				for (int nbrs : graph[rp.vtx]) {
					if (!visited.containsKey(nbrs)) {
						q.add(new BipartitePairs(nbrs, rp.dis + 1));
					}
				}
			}
		}
		return true;
	}

}

class BipartitePairs {
	int vtx;
	int dis;

	public BipartitePairs(int vtx, int dis) {
		this.vtx = vtx;
		this.dis = dis;
	}

}