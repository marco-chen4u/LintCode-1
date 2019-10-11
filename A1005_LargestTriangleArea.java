package a;


public class A1005_LargestTriangleArea {

	public static void main(String[] args) {
		
		
		int[][] points = new int[][] {
			{0,0},{0,1},{1,0},{0,2},{2,0}
		};

		System.out.println(largestTriangleArea(points));

	}
	
	public static double largestTriangleArea(int[][] points) {
	       double res = 0;
	       for (int[] x : points)
	           for (int[] y : points)
	               for (int[] z : points)
			       //https://zhidao.baidu.com/question/93368735.html
			       // 三角形面积公式 S = 1/2 ((x1y2 - x2y1) + (y1z2 - y2z1) + (z1x2 - z2x1))
	                   res = Math.max(res, 0.5 * (x[0] * y[1] + y[0] * z[1] + z[0] * x[1]
	                           - x[0] * z[1] - y[0] * x[1] - z[0] * y[1]));
	       return res;
	   }

}
