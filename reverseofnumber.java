package questions;

public class reverseofnumber {

	public static void main(String[] args) {
		reverse(123456);
	}
		public static void reverse(int n) {
			while(n!=0) {
			int rem=n%10;
			System.out.println(rem);
			n/=10;}
		}
		
		
}
