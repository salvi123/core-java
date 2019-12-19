package stringMethod;

public class ContainsExample2 
{
	public static void main(String args[])
	{
		String s1="Hello F#A#C#E@2.0 readers";
		boolean isContains = s1.contains("F#A#C#E");
		System.out.println(isContains);
		// case sensitive
		System.out.println(s1.contains("FACE"));
	}
}
