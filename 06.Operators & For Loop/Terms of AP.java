import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        for (int i=1;i<=a;i++){
            int ap=3*i+2;
            if (ap%4!=0) {
                System.out.print(ap + " ");
            }
            else{a++;}
            }

	}
}
