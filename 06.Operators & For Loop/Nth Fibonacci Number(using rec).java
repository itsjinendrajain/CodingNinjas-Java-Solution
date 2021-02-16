import java.util.Scanner;
public class Solution {
    static int fib(int n){
        if (n==1) {
            return 1;
        }
        else if (n==2){
            return 1;
            }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

	public static void main(String[] args) {
		
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        System.out.println(fib(a));

		
	}

}
