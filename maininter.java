package case5dec;

import java.util.Scanner;

public class maininter {
	

	static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		case51 ob=new case51();
		ob.add(a, b);
		ob.sub(a, b);
		ob.mul(a, b);
		ob.div(a, b);

}
}
