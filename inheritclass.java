package case4dec;

public class inheritclass extends abs {
	public void add(int a,int b)
	{
		System.out.println(a+"+"+b+"="+(a+b));
	}
	public void sub(int a,int b)
	{
		super.sub(a,b);
	}

}
