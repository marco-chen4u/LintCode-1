package lintCodeWithMrChen;

public class A0116_JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,2,1,0,4};
		canJump(A);
	}
	
	public static boolean canJump(int[] a) {
		int reach = 0, n = a.length;
		for(int i = 0; i < n; i++) {
			if(i > reach) {
				return false;
			}
			reach = Math.max(i + a[i], reach);
		}
		return true;
	}

}
