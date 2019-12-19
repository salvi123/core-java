package stringMethod;

public class EqualsExample1 
{
	public static void main(String args[])
	{
		String s1="fecenow";
		String s2="fecenow";
		String s3="feceprep";
		String s4="fecenxt";
		System.out.println(s1.equals(s2));//true because content and case are same
		System.out.println(s1.equals(s3));//false because case is not same
		System.out.println(s1.equals(s4));//false because content is not same
		
	}
}
