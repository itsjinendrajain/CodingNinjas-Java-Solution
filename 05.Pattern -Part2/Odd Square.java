import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();

        for (int j=0;j<jj;j++){
            int i=0+(j*2);
            int l=i;
            for (int p=1;p<=jj-j;){
                if (l%2!=0){
                    System.out.print(l);
                    p+=1;
                }
                l+=1;
            }
            int jg=0;
            for (int q=0;q<j;){
                if (jg%2!=0){
                    System.out.print(jg);
                    q+=1;
                }
                jg++;
            }
            System.out.println();

        }
	}
}
