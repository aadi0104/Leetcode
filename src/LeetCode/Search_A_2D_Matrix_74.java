package LeetCode;

public class Search_A_2D_Matrix_74 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		boolean ans = StairCaseSearch2DArray(matrix, target);
		System.out.print(ans);
	}

	public static boolean StairCaseSearch2DArray(int[][] arr, int k) {
		int row = 0;
		int col = arr[0].length - 1;
		boolean flag = false;
		while (col >= 0 && row <= arr.length - 1) {
			if (arr[row][col] == k) {
				flag = true;
				break;
			} else if (arr[row][col] > k) {
				col--;
			} else {
				row++;
			}
		}
		return flag;
	}
	
}
