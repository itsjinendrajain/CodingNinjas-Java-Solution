import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
Scanner inp=new Scanner(System.in);
        int num= inp.nextInt();
        for(int i=2;i<=num;i++) {
            boolean isFactor=true;
//            This For- use to check if there  is factor or not
            for(int p=2;p<=i/2;p++){
                if (i%p==0){
                    isFactor=false;
//                  This Means It has factor it will break now
                    break;
                }
            }
            if (isFactor==true){
                System.out.println(i);
            }
        }

		
	}
}
