public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
		int count0=0;
		for(int i : arr) {
			if(i==0) {
				count0++;
			}
		}
		for(int i=0;i<count0;i++) {
		arr[i]=0;	
		}
		for(int i=count0;i<arr.length;i++) {
			arr[i]=1;
		}
    }
}