package LeetCode;

public class Rings_And_Rods_2103 {

	public static void main(String[] args) {
		String rings = "B0B6G0R6R0R6G9";
		int ans = Rings_And_Rods(rings);
		System.out.print(ans);
	}

	public static int Rings_And_Rods(String rings) {
		String[] colorlist = new String[10];
		for (int i = 0; i < rings.length(); i += 2) {
			String str = "";
			str += rings.charAt(i + 1);
			int index = Integer.parseInt(str);
			if (colorlist[index] != null) {
				str = colorlist[index];
			} else {
				str = "";
			}
			str += rings.charAt(i);
			colorlist[index] = str;
		}
		return Count_Rings_In_Rods(colorlist);
	}

	public static int Count_Rings_In_Rods(String[] colorlist) {
		int count = 0;
		for (int i = 0; i < colorlist.length; i++) {
			int tempcount = 0;
			if (colorlist[i] != null && colorlist[i].contains("R")) {
				tempcount++;
			}
			if (colorlist[i] != null && colorlist[i].contains("G")) {
				tempcount++;
			}
			if (colorlist[i] != null && colorlist[i].contains("B")) {
				tempcount++;
			}
			if (tempcount == 3) {
				count++;
			}
		}
		return count;
	}
}
