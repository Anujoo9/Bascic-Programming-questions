package questions;

public class pythagoras_triplets {

	public static void main(String[] args) {
		rightangle(13,5,12);

	}
public static void rightangle(int a, int b, int c) {
	int max = 0;
	if(a>b && a>c) {max=a;} 
	else if(b>c&& b>c) {max=b;
	}else max=c;
	
	
	if (max==a) {
		boolean flag = (a*a== b*b + c*c);	
		System.out.println(flag);
	}else if(max==b)
	{	boolean flag = b *b == a*a + c*c;
		System.out.println(flag);
	}else {boolean flag = c*c == a*a + b*b;
		System.out.println(flag);}
	
	
}
}
