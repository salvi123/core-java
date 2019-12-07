package case4dec;

import java.util.Scanner;

public class abstraction {

public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	int a,b;
	System.out.println("Enter two numbers");
	a=s.nextInt();
	b=s.nextInt();
	abs ob=new inheritclass();
	ob.add(a, b);
	ob.sub(a, b);
}
}