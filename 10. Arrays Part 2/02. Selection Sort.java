import java.util.Scanner;
public class Solution {  

    public static void selectionSort(int[] arr) {
    	int index;
		for(int i=0;i<arr.length-1;i++) {
			index=i;  
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
	
			
			int save=arr[i];
			arr[i]=arr[index];
			arr[index]=save;
		}
		
		
		
		
    }   
    

}
