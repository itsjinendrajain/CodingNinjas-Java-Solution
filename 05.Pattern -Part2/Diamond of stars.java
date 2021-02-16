import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int jg= inp.nextInt();
        int p1=(jg+1)/2;
        int p2=jg/2;
        for (int i=1;i<=p1;i++){
            for (int g=1;g<p1+1-i;g++){
                System.out.print(" ");
            }
            for (int j=1;j<(i*2);j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        part 2 of loop
        for (int i=1;i<=p2;i++){
            for (int s2=1;s2<=i;s2++){
                System.out.print(" ");
            }
            int loo=((p2-i+1)*2);
            for (int p=1;p<loo;p++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
}