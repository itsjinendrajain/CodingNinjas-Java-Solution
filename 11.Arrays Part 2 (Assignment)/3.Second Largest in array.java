public class Solution {  

    public static int secondLargestElement(int[] arr) {
        int FirstL = Integer.MIN_VALUE;
        int SecL = Integer.MIN_VALUE;
        for (int a : arr) {
            if (FirstL < a) {
                FirstL = a;
            }
        }
        for (int b : arr) {
            if (FirstL > b && SecL < b) {
                SecL = b;
            }
        }
//        System.out.print(SecL);
        return SecL;
    }

}