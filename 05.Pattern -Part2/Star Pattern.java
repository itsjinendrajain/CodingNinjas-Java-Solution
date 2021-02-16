import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
        int jg= inp.nextInt();
        for (int i=1;i<=jg;i++){
            for (int g=1;g<jg+1-i;g++){
                System.out.print(" ");
            }

            for (int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

		
	}

}
.