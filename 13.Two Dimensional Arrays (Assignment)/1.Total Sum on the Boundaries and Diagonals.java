
public class Solution {

	public static void totalSum(int[][] mat) {
int horizontal=mat.length-1;
        if (horizontal==-1) {
            System.out.println(0);
            System.exit(0);
        }
        
        
        int vertically=mat[0].length-1;
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i==0 | j==0 | i==horizontal | j==vertically |i==j | j==horizontal-i){
//                    System.out.print(mat[i][j]+" ");
                    sum+=mat[i][j];
                }
            }
        }
//        return sum;
        System.out.print(sum);
	}

}