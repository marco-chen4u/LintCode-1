package javaCode;

public class A596_AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(57));

	}
	
	public static int addDigits(int num) {
        // write your code here
                return num==0?0:(num%9==0?9:(num%9));

    }

}
