package LeetCode;

public class Check_If_Number_Is_A_Sum_Of_Powers_Of_Three_1780 {

	public static void main(String[] args) {
		int n = 12;
		Check_If_Number_Is_A_Sum_Of_Powers_Of_Three(n);
	}
	
	public static boolean Check_If_Number_Is_A_Sum_Of_Powers_Of_Three(int n) {
//		Converting the number to base = 3, if remainder is 0 or 1, the it can be represented as distinct power of 3, but if 2 appears as remainder, its not.
		while(n > 0) {
			if(n % 3 == 2) {
				return false;
			}
			n /= 3;
		}
		return true;
	}
	
}