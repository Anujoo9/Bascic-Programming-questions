package questions;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int t=sc.nextInt();
		
		for (int i =1;i<=t;i++) {///for again and again input
			int x = sc.nextInt();
			int count =0;
			for (int j=2;j*j<=x;j++) {
					if (x%j==0) {
						count++; 
						break;}
					}
					
			if (count ==0) System.out.println("Prime");
			else System.out.println("Composite");
			
		
			
			}

		}
		}
	

	


