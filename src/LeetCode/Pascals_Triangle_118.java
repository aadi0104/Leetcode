package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {

	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list = Pascals_Triangle(numRows);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + ", ");
			}
		}
	}

	public static List<List<Integer>> Pascals_Triangle(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int times = 1;
		for (int i = 0; i < numRows; i++) {
			List<Integer> innerList = new ArrayList<Integer>();
			int ncr = 1;
			for (int j = 0; j <= i; j++) {
				innerList.add(ncr);
				ncr = (i - j) * ncr / (j + 1);
			}
			list.add(innerList);
			times++;
		}
		return list;
	}

}
