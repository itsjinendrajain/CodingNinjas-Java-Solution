import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=(10*rev)+rem;
            n=n/10;
        }
        System.out.println(rev);

	}
}
