package LeetCode;

public class Power_Of_Three_326 {

	public static void main(String[] args) {
		int n = 10;
		boolean ans = Power_Of_Three(n);
		System.out.print(ans);
	}

	public static boolean Power_Of_Three(int n) {
		if(n == 1) {
			return true;
		}
        if(n == 0) {
			return false;
		}
		if( n % 3 != 0) {
			return false;
		}
		return Power_Of_Three(n / 3);
	}

}