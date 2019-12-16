package stringtokenizer;

import java.util.StringTokenizer;

public class StringTockenizerExample {
	
	public static void main(String argd[])
	{
		String str = "I, am, going, to ,split, this, string by, space";
		StringTokenizer st =new StringTokenizer(str);
		System.out.println("Split by space");
		while(st.hasMoreElements())
		{
			System.out.print(st.nextElement());
		}
		System.out.println();
		System.out.println("Split by ,");
		StringTokenizer st1 =new StringTokenizer(str, ",");
		while(st1.hasMoreElements())
		{
			System.out.print(st1.nextElement());
		}
	}

}
