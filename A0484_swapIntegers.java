package lintCodeWithMrChen;

public class A0484_swapIntegers {
	public void swapIntegers(int[] a, int index1, int index2) {
        // write your code here
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp; 
    }

}
