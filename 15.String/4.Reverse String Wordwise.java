public class Solution {
	public static String reverseWordWise(String input) {
        String[] arrOdStr=input.split(" ");
        String reverseWord="";
        for (int i = arrOdStr.length-1;i >=0 ; i--) {
            reverseWord+=arrOdStr[i]+" ";
        }
        return reverseWord;

	}
}
