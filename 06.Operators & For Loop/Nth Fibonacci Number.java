import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        int p=0;
        int a=0;
        int b=1;
        int c=0;
for (int i=1;i<=n;i++){
    c=a+b;
    a=b;
    b=c;

}
System.out.println(a);

		
	}

}
