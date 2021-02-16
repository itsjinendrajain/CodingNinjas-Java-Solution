import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        float basic= inp.nextInt();
        String allow=inp.next();
        float hra=0.2f*basic;
        float pf=0.11f*basic;
        float da=0.5f*basic;
        float salary;
        if (allow.charAt(0)=='A'){
            salary=((basic+da+hra+1700)-pf);
        }
        else if (allow.charAt(0)=='B'){
            salary=((basic+da+hra+1500)-pf);
        }
        else {
            salary=((basic+da+hra+1300)-pf);
        }
        System.out.println(Math.round(salary));


	}
}
