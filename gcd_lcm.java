package questions;

public class gcd_lcm {

	public static void main(String[] args) {
		int a=gcm(36,12);
		System.out.println(a);
		int b=lcm(24,36);
		System.out.println(b);

	}
	public static int gcm (int n1, int n2) {
		
		while(n1%n2!=0) {
			int rem = n1%n2;
			n1= n2;
			n2=rem;
		}
		return n2;
	}
	
	public static int lcm(int n1, int n2) {
		int num =0;
		int i = 2;
		while(i<=n1*n2) {
			if(i%n1==0 && i%n2==0) {
				num = i;
				break;}i++;
		}
	return num;}

}
