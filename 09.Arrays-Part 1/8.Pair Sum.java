public class Solution {  

    public static int pairSum(int arr[], int x) {
    	        int count=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if (i!=j && ((arr[i]+arr[j])==x)){
                    count++;
                }
            }
        }
        return count;
    }
}