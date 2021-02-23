public class Solution {

    public static int arrayRotateCheck(int[] arr){
int check=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]<arr[i]){
                if (check==0)check++;
                check++;
            }
            else {
                break;
            }
        }
        if (check==arr.length)check=0;
        return check;
    }

}