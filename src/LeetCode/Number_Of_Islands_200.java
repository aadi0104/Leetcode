package LeetCode;

import java.util.*;

public class Number_Of_Islands_200 {

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		int ans = Number_Of_Islands(grid);
		System.out.print(ans);
	}

	public static int Number_Of_Islands(char[][] grid) {
		Queue<IslandPairs> q = new LinkedList<>();
		HashMap<String, Boolean> visited = new HashMap<>();
		int islands = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == '0' || visited.containsKey(row + "," + col)) {
					continue;
				}
				islands++;
				q.add(new IslandPairs(row, col));
				while (!q.isEmpty()) {
					// 1. Remove
					IslandPairs rp = q.poll();
					// 2. Ignore
					if (visited.containsKey(rp.row + "," + rp.col)) {
						continue;
					}
					// 3. Mark Visited
					visited.put(rp.row + "," + rp.col, true);
					// 4. Self Work

					// 5. Add NBRS
					int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
					for (int[] dir : directions) {
						int nrow = rp.row + dir[0];
						int ncol = rp.col + dir[1];

						if (nrow >= 0 && ncol >= 0 && nrow < grid.length && ncol < grid[0].length
								&& grid[nrow][ncol] == '1' && !visited.containsKey(nrow + "," + ncol)) {
							q.add(new IslandPairs(nrow, ncol));
						}
					}
				}
			}
		}
		return islands;
	}
	
}

class IslandPairs {
	int row;
	int col;

	public IslandPairs(int row, int col) {
		this.row = row;
		this.col = col;
	}
}