public class Solution
{
    public static int[] merge(int arr1[], int arr2[])
{ 
        int[] ans = new int[arr1.length + arr2.length];
 int i = 0, j = 0, k = 0; 
        while(i < arr1.length && j < arr2.length)
 { 
            if(arr1[i] < arr2[j])
 {
     ans[k] = arr1[i]; k += 1; i += 1; 
                        
            }
  else { 
      ans[k] = arr2[j]; k += 1; j += 1;
       } 
 }
        while(i < arr1.length) {
    ans[k] = arr1[i]; k += 1; i += 1; 
 } 
 while(j < arr2.length){ 
     ans[k] = arr2[j]; k += 1; j += 1;
 } 
 return ans; 
} 
}