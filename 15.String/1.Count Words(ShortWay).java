public class Solution {
	public static int countWords(String str) {
       		if(str.length()==0) return 0;
        	String[] s1=str.split(" ");
        	return s1.length;
	}

}