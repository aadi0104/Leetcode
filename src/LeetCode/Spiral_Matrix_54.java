package LeetCode;

import java.util.*;

public class Spiral_Matrix_54 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		list = Spiral(matrix);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
	}

	public static List<Integer> Spiral(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		int n = matrix.length;
		int m = matrix[0].length;
		int minR = 0;
		int minC = 0;
		int maxR = matrix.length - 1;
		int maxC = matrix[0].length - 1;
		while (list.size() < m * n) {
			for (int i = minC; i <= maxC && list.size() < m * n; i++) {
				list.add(matrix[minR][i]);
			}
			minR++;
			for (int i = minR; i <= maxR && list.size() < m * n; i++) {
				list.add(matrix[i][maxC]);
			}
			maxC--;
			for (int i = maxC; i >= minC && list.size() < m * n; i--) {
				list.add(matrix[maxR][i]);
			}
			maxR--;
			for (int i = maxR; i >= minR && list.size() < m * n; i--) {
				list.add(matrix[i][minC]);
			}
			minC++;
		}
		return list;
	}
}
