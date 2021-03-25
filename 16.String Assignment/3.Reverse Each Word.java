
public class Solution {

	public static String reverseEachWord(String str) {
        String[] ArrStr=str.split(" ");
        String mynewStr=new String("");
        for (String s : ArrStr) {
            for (int j = s.length() - 1; j >= 0; j--) {
                mynewStr += s.charAt(j);
            }
            mynewStr += " ";
        }
        return mynewStr;
	}

}