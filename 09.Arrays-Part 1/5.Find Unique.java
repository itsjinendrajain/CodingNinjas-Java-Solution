public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
                for (int i = 0; i < arr.length; i++) {
            int jg=-1;
            for (int j = 0; j < arr.length; j++) {
                    if (arr[i]==arr[j]){
                        jg++;
                    }
            }
            if (jg==0){
                return arr[i];
            }
                    
            
        }
        return arr[0];
    }
}