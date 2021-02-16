import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner jass = new Scanner(System.in);
        int a = jass.nextInt();
        int b = jass.nextInt();
        int jj = 1;
        
            for (int i = 1; i <= b; i++) {
                jj *= a;
            }
            System.out.println(jj);
        
        
    }
}