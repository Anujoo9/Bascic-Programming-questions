package questions;

public class printdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			print_digit(100);
//			System.out.println(count(378));
//			System.out.println(50/10);
	}
	public static void print_digit(int n) {
		int a =count(n);
		int div=10;
		div = (int)Math.pow(10,a-1);
		while(div!=0) {
			
		//	System.out.println(div);
			int q = n/div;
		//	System.out.println(n);
			System.out.println(q);
			n= n%div;
			div/=10;
		}
	}
	public static int count (int n) {
		int count =0;
		while(n!=0) {
			count++;
			n=n/10;
			
		}return count;
	}

}
