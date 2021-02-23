
public class Solution {

	public static void rowWiseSum(int[][] mat) {
        int l= mat.length;
        for (int i = 0; i < l; i++) {
            int sum=0;
            for (int j = 0; j <mat[i].length; j++) {
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
	}

}