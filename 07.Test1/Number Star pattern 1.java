import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
 Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(a-j);
            }
            System.out.print("*");


            for (int j = 1; j < i; j++) {
                System.out.print(i-j);
            }


            System.out.println();
        }

	}
}
