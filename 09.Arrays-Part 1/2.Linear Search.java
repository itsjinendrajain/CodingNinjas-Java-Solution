public class Solution {

    public static int linearSearch(int arr[], int x) {
        boolean find=false;
        int i;
        for (i =0;i< arr.length;i++){
            if (arr[i]==x){
                find=true;
                break;
            }
        }
        if (find==false){
            return -1;
        }
        else {
            return i;
        }
    }
}