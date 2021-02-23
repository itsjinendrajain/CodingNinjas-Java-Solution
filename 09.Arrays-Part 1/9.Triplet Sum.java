
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	int count=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (i!=j && ((arr[i]+arr[j]+arr[k])==x)){
                        count++;
                    }

                }
            }
        }
        return (count);
    }

}