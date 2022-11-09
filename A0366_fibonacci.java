package lintCodeWithMrChen;

public class A0366_fibonacci {
	public int fibonacci(int n) {
		int a = 0;
		int b = 1;
		for(int i = 0; i <= n - 1; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return a;
	}

}
