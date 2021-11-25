package questions;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
inverse(21453);
	}
 public static void inverse(int n) {
	int  count = 1;
	int  inv =0;
	 while(n!=0) {
		 int rem = n%10;
		 inv = (int)(inv + count*Math.pow(10, rem-1));
		
		 n/=10;
		 count++;
		 
		 
	 }
	 System.out.println(inv);
	 
 }
 
}
