import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int jg=inp.nextInt();
        int jj=jg;
        for(int i=2;i<=jj/2;i++){
            if (jg%i==0){
                System.out.print(i+" ");
            }
        }
        
    }
}