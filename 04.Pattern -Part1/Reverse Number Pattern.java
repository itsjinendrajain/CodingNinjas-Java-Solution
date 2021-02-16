import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		        Scanner inp=new Scanner(System.in);
        int jj=inp.nextInt();
for(int i=1;i<=jj;i++) {
            int jg=i;
            for (int p = 1; p <= i; p++) {

                System.out.print(jg);
                jg=jg-1;
            }
            System.out.println();
        }

		
	}

}
