import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int z=inp.nextInt();
        int ans=1;
        switch (z) {
            case 1:
                ans = (n * n + n) / 2;
                System.out.println(ans);
                break;
            case 2:
                for (int i = 1; i <= n; i++) {
                    ans = ans * i;
                }
                System.out.println(ans);
                break;
            default:
                System.out.println(-1);
                break;
        }
        
        
        
	}
}
