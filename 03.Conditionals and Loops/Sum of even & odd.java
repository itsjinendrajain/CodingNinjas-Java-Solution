import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        String jass=inp.next();

        int even=0;
        int odd=0;

        for (int i=0;i<jass.length();i++){
            int jj=(jass.charAt(i)-48);
            if (jj%2==0){
                even=even+jj;
            }
            else {
                odd=odd+jj;
            }
        }
        System.out.println(even+" "+odd);

	}
}
