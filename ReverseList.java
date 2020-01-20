package arraylist;
import java.util.*;
public class ReverseList 
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		ArrayList<String> stationary=new ArrayList<String>();
		System.out.println("Enter the number of items : ");
		int n=s.nextInt();
		System.out.println("Enter the item : ");
		for(int i=0;i<n;i++)
		{
		String item= s.next();
		stationary.add(i,item);
		
		}
		System.out.println(stationary);
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(stationary.get(i));
		}
		
	}

}
