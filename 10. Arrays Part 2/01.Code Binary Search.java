public class Solution {
    public static int binarySearch(int[] arr, int x)
    { 
        int start = 0; int end = arr.length - 1; int mid = start; while(start <= end)
        { 
            mid = start + (end - start) / 2; if (arr[mid] > x) {
                end = mid - 1; 
            }
            else if
                (arr[mid] < x) 
            {
                start = mid + 1; 
            } 
            else 
            { 
                return mid;
                                       
            } 
        }
        return -1; 
    } 
}