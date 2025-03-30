package LeetCode;

public class Student_Attendance_Record_551 {

	public static void main(String[] args) {
		String s = "PPALLL";
		boolean ans = Student_Attendance_Record(s);
		System.out.print(ans);
	}

	public static boolean Student_Attendance_Record(String s) {
		int absent = 0;
		int late = 0;
		int count = 0;
		while (count < s.length()) {
			if (s.charAt(count) == 'A') {
				absent++;
			}
			if (s.charAt(count) == 'L') {
				late++;
			} else {
				late = 0;
			}
			count++;
			if (absent == 2 || late == 3) {
				return false;
			}
		}
		return true;
	}
	
}
