public class Solution { 
    public static void insertionSort(int[] arr) 
    {
        int i = 1; int temp; while(i < arr.length)
    {
        temp = arr[i]; int j = i - 1; while(j >= 0)
    {
        if(arr[j] > temp) 
        {
            arr[j + 1] = arr[j]; 
                        }
     else 
     { 
         break;
     }
     j -= 1; 
    } 
     arr[j + 1] = temp; i += 1; 
    }
    }
}