package lintCodeWithMrChen;

public class A0413_ReverseInteger {
	public int reverseInteger(int x) {
		long res = 0;
		while(x != 0) {
			res = res * 10 + x % 10;
			x /= 10;
		}
		if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
			return 0;
		} else {
			return (int)res;
		}
	}

}
