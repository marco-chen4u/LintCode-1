package javaCode;

public class A845_GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(15,30));

	}
	
	public static int gcd(int a, int b) {
        // write your code here
        int n = 1;
        for(int i = 2; i <= Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                n = i;
            }
        }
        return n;
    }

}
