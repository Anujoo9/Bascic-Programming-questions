package questions;

import java.util.Scanner;

public class rotate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int a = sc.nextInt();
		System.out.println("Enter digits to be rotated ");
		int k = sc.nextInt();
	
		if(k>0) {
			int div = (int)Math.pow(10, k);
				int rem = a%div;
				int n = a/div;
				int x=count(n);
				int sum = n + rem*(int)Math.pow(10, x) ;
				System.out.println(sum);}
		else {
		int x = count(a);
		int x2 = k+x;
		int div = (int)Math.pow(10, x2);
		int rem = a%div;
		int n = a/div;
		int	x3=count(n);
		int sum =rem*(int)Math.pow(10, x3) +n ;
		System.out.println(sum);
		
		}
		
	}
	public static int count(int n) 
	{
		int count = 0;
		while(n!=0) {
			count++;
			n/=10;
		}
		return count;
	}

}
