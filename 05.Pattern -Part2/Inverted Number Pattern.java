import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();
        for(int i=0;i<jj;i++){
            for(int p=1;p<=jj-i;p++){
                System.out.print(jj-i);

            }
            System.out.println();
        }

		
	}

}
