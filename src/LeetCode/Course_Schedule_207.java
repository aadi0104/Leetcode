package LeetCode;

import java.util.*;

public class Course_Schedule_207 {

	private HashMap<Integer, List<Integer>> map;

	public Course_Schedule_207(int v) {
		map = new HashMap<>();
		for (int i = 0; i <= v; i++) {
			map.put(i, new ArrayList<>());
		}
	}

	public void Addedge(int v1, int v2) {
		map.get(v1).add(v2);
	}

	public static void main(String[] args) {
		int numCourses = 2;
		int[][] prerequisites = { { 1, 0 } };
		Course_Schedule(numCourses, prerequisites);
	}

	public static boolean Course_Schedule(int numCourses, int[][] prerequisites) {
		Course_Schedule_207 cs = new Course_Schedule_207(numCourses);
		for (int[] edge : prerequisites) {
			cs.Addedge(edge[1], edge[0]);
		}
		return !cs.isCyclic(numCourses);
	}

	public int[] indegree(int numCourses) {
		int[] in = new int[numCourses];
		for (int e1 : map.keySet()) {
			for (int nbrs : map.get(e1)) {
				in[nbrs]++;
			}
		}
		return in;
	}

	public boolean isCyclic(int numCourses) {
		Queue<Integer> q = new LinkedList<>();
		int[] in = indegree(numCourses);
		for (int i = 0; i < numCourses; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}

		int c = 0;
		while (!q.isEmpty()) {
			int r = q.poll();
			c++;
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c != map.size();
	}
}

