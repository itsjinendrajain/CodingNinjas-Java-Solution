
public class Solution {

	public static char highestOccuringChar(String str) {
        char[] uniqueArr=new char[str.length()-1];
        char MaxOcc=str.charAt(0);
        int Bcount =1;
        int count;
        for (int i = 0; i < str.length(); i++) { count =0;
            boolean skipThis=false;
            for(char ele:uniqueArr){
                if (str.charAt(i) == ele) {
                    skipThis = true;
                    break;
                }
            }

            if (skipThis) continue;
            else uniqueArr[i]=str.charAt(i);
            
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) count++;
            }

            if (count>Bcount) {
                MaxOcc=str.charAt(i);
                Bcount=count;
            }
        }
        return MaxOcc;
	}

}