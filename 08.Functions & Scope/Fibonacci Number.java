public class Solution {
	
	public static boolean checkMember(int n){
        int a = 0; 
        int b = 1;
        int c = -1;
        boolean isFib=false;
        while (a<n) {
            c = a + b;
            a = b;
            b = c;
            if (a==n){
                isFib=true;
            }
        }
        return isFib;

	}
	

}
