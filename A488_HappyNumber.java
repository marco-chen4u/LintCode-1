package javaCode;

public class A488_HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));

	}

	public static boolean isHappy(int n) {
        // write your code here
         while (n != 1 && n != 4) {
            int t = 0;
            while (n !=0) {
                t += (n % 10) * (n % 10);
                n /= 10;
            }
            n = t;
        }
        return n == 1;
    
    }
}
