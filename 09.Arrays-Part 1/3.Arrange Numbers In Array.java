
public class Solution {
    
    public static void arrange(int[] arr, int n) {
        if (n%2 != 0) {
            arr[n/2]=n;
        }
        int even = 2; int odd = 1; int i = 0;
        while (i < n/2) {
            arr[i] = odd;
            odd += 2;
            arr[n - i-1] = even;
            even += 2;
            i++;}

    }
}