
public class Solution {

    public static void sort012(int[] arr){
int zero=0;
        int one=0;
// int two=0;
        for (int ele:arr) {
            if (ele==0)zero++;
            else if (ele==1)one++;
            // else if (ele==2)two++;
        }
                int two=arr.length-zero-one; //Another Way to Get Two
        for (int i = arr.length-two; i <arr.length ; i++) {
            arr[i]=2;
        }
        for (int i = arr.length-two-one; i <arr.length-two ; i++) {
            arr[i]=1;
        }
        for (int i = 0; i <zero ; i++) {
            arr[i]=0;
        }
    
    }

}