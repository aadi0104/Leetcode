package LeetCode;
import java.util.*;

public class Construct_Smallest_Number_From_DI_String_2375 {

	public static void main(String[] args) {
		String pattern = "IIIDIDDD";
		String ans = Construct_Smallest_Number_From_DI_String(pattern);
		System.out.print(ans);
	}

	public static String Construct_Smallest_Number_From_DI_String(String pattern) {
		int[] arr = new int[pattern.length() + 1];
		Stack<Integer> st = new Stack<>();
		int count = 1;
		for (int i = 0; i <= pattern.length(); i++) {
			if (i == pattern.length() || pattern.charAt(i) == 'I') {
				arr[i] = count++;
				while (!st.isEmpty()) {
					arr[st.pop()] = count++;
				}
			} else {
				st.push(i);
			}
		}
		String ans = "";
		for (int i : arr) {
			ans += i;
		}
		return ans;
	}

}
