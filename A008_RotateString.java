package javaCode;

public class A008_RotateString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abcdefg");
		char[] str =s.toCharArray();
		rotateString(str,3);

	}
	
	public static void rotateString(char[] str, int offset) {
        // write your code here
        char temp;
        if(str.length == 0) return;
        if(offset == 0) return;
        if(str.length < offset) offset = offset % str.length;
        while(offset>0){
            temp = str[str.length-1];
            for(int i = str.length - 1; i > 0;i--){
                str[i] = str[i-1];
            }
            str[0]=temp;
            offset--;
            System.out.println(str);
        }
    }

}
