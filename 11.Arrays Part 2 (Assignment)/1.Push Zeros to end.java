public class Solution {  

    public static int[] pushZerosAtEnd(int[] arr) {
        int[] arr2=new int[arr.length];
        int p=0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr[i]!=0){
                arr2[p]=arr[i];
                p++;
            }
        }
        System.arraycopy(arr2, 0, arr, 0, arr.length);
        return arr;
    }

}