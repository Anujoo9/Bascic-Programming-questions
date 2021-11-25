package questions;
import java.util.*;
public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));
	}
	public static int count (int n) {
		int count =0;
		while(n!=0) {
			count++;
			n=n/10;
			
		}return count;
	}

}
