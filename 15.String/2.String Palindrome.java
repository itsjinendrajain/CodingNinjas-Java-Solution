
public class Solution {

	public static boolean isPalindrome(String str) {
        int len=str.length()-1;
        String a= "";
        for (int i = len; i >=0 ; i--) {
            a+=(str.charAt(i));
        }
        // System.out.println(a);
        return a.equals(str);
	}

}