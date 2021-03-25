
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            a.append(str.charAt(i));
            if (i<str.length()-1){
                while (str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                    if (i>=str.length()-1) break;
                }
            }
        }
        return a.toString();
	}

}