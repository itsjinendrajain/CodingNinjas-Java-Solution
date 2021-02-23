public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
        for (int i=start;i<=end;){
            System.out.println(i+" "+(((i-32)*5)/9));
            i=i+step;
        }
	}
}