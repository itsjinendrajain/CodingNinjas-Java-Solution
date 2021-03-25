
public class Solution {

	public static void printSubstrings(String str) {
		for (int i = 0; i < str.length(); i++) {
            		for (int j = i; j < str.length(); j++) {
                		for (int k = i; k <=j; k++) {
                    			System.out.print(str.charAt(k));
                		}
                		System.out.println();
            		}
        	}
	}

}