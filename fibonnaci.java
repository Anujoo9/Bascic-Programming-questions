package questions;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a= 0;
		int b=1;
		int sum = 0;
		//System.out.println(a +"\n"+b);
		for(int i=1; i<=n;i++) {
			System.out.println(a);
			sum= a+b;
			a=b;
			b=sum;
			
		}
		

	}

}
