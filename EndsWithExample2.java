package stringMethod;

public class EndsWithExample2 
{
	public static void main(String args[])
	{
		String s1="Welcome to FACE.in";
		System.out.println(s1.endsWith("in"));
		if(s1.endsWith(".com"))
		{
			System.out.println("String ends with.com");	
		}
		else
		{
			System.out.println("It does not ends with.com");	
		}
	}
}
