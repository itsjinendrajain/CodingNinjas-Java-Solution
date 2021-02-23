import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
        int orgN=inp.nextInt();
        int n=orgN;
        int sum=0;
        int length = (int) (Math.log10(n) + 1);
        while (n>0){
            int remainder=n%10;
            sum+=(Math.pow(remainder,length));
            n=n/10;
        }
        if (sum==orgN){
     System.out.print(true);
 }
 else {
     System.out.print(false);
 }

	}
}
