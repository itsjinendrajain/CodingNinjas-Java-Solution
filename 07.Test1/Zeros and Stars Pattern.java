import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(0);
            }
            System.out.print("*");

            for (int j = n-i; j >0 ; j--) {
                System.out.print(0);
            }
            System.out.print("*");
            for (int j = n-i; j >0 ; j--) {
                System.out.print(0);
            }

            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(0);
            }
//            System.out.print("*");
            System.out.println();
        }
		
	}	


}
