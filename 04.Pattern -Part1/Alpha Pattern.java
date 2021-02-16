import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
        Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();
        for(int i=1;i<=jj;i++){
            char A=(char)(65+i-1);
            for(int p=1;p<=i;p++){
                System.out.print(A);
                
            }
            System.out.println();
        }
        int i=0;

		
	}

}