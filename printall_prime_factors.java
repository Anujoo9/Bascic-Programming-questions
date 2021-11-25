package questions;

import java.util.Scanner;

public class printall_prime_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		factors(n);

	}
public static void factors(int n) {
	int	i=2;
	while(i*i<=n) {					// optimisation
			if(n%i==0) {
				System.out.println(i);
				n/=i;}
			else			
			{i++;}
			
	}
	if (n!=1) System.out.println(n);
	
}
}
