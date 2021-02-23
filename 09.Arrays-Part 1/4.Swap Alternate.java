
public class Solution {
    
    public static void swapAlternate(int arr[]) {
        for (int i = 0; i < arr.length-1; i+=2) {
            int jj=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=jj;
        }
            
        
    }
}