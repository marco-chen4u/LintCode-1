package lintCodeWithMrChen;

public class A0037_Reverse3DigitInteger {
	public int reverseInteger(int number) {
		int reversed = 0;
		
		while(number > 0) {
			int dig = number % 10;
			reversed = reversed * 10 + dig;
			number /= 10;
		}
		return reversed;
	}

}
