import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
        Scanner inp=new Scanner(System.in);
        int Start=inp.nextInt();
        int End=inp.nextInt();
        int Step=inp.nextInt();
        for (int i=Start;i<=End;){
            System.out.println(i+" "+(((i-32)*5)/9));
            i=i+Step;
        }
		
	}

}
