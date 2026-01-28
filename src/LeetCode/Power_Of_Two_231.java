package LeetCode;

public class Power_Of_Two_231 {

	public static void main(String[] args) {
		int n = 8;
		boolean ans = Power_Of_Two(n);
		System.out.print(ans);
	}

	public static boolean Power_Of_Two(int n) {
		if(n == 1) {
			return true;
		}
        if(n == 0) {
			return false;
		}
		if( n % 2 != 0) {
			return false;
		}
		return Power_Of_Two(n / 2);
	}
}