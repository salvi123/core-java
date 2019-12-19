package stringMethod;

public class CompareToExample1 {
	
	public static void main(String args[])
	{
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		System.out.println(s1.compareTo(s1));// both are equal
		System.out.println(s1.compareTo(s3));// h is 5 times lower than m
		System.out.println(s1.compareTo(s4));// l is 1 times lower than m
		System.out.println(s1.compareTo(s5));// h is 5 times greater than f
	}

}
