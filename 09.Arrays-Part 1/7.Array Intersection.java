
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
// ArrayArray
                for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=-9999999;
                    break;
                }
            }
        }
    }
}