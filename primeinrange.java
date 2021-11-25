package questions;

public class primeinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 2;
		int n2 =30;
		for(int i = n1; i<=n2;i++) {
			if(prime(i)) 
				{System.out.println(i);}
			}
		

	}
	public static boolean prime(int n) {
		int count=0;
		for (int i=2; i*i<=n; i++) {
			if(n%i==0) {count++;break;}
			}
		return count==0;
	}
}

