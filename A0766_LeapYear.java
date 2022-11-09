package lintCodeWithMrChen;

public class A0766_LeapYear {
	public boolean isLeapYear(int n) {
		return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
	}
}
