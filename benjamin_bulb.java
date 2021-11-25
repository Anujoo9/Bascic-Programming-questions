package questions;
import java.util.Scanner;
public class benjamin_bulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n= sc.nextInt();
		int i=1;
		while (i*i<=n) {
			 System.out.println(i*i);
			 i++;
			
		} System.out.println("For loop now");
		for (int j=1; j*j<=n;j++) {
			System.out.println(j*j);
		}

	}

}
 