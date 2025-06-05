package LeetCode;

public class Robot_Return_To_Origin_657 {

	public static void main(String[] args) {
		String moves = "UDR";
		boolean ans = Robot_Return_To_Origin(moves);
		System.out.print(ans);
	}

	public static boolean Robot_Return_To_Origin(String moves) {
		int horizontal = 0;
		int vertical = 0;
		for (int i = 0; i < moves.length(); i++) {
			if (moves.charAt(i) == 'U') {
				vertical++;
			} else if (moves.charAt(i) == 'D') {
				vertical--;
			} else if (moves.charAt(i) == 'L') {
				horizontal++;
			} else {
				horizontal--;
			}
		}
		if (horizontal == 0 && vertical == 0) {
			return true;
		}
		return false;
	}

}
