import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
        Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();
        for(int i=1;i<=jj;i++){
            
            for(int p=1;p<jj+1-i;p++){
                System.out.print(" ");
            }
            for(int q=1;q<=i;q++){
                System.out.print(q);
            }
            
            System.out.println();
        }

		
	}

}
