package arraylist;
import java.util.*;
public class Student {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> obj = new ArrayList<Integer>();
		System.out.println("Enter the number of subjects");
		int n=s.nextInt();
		System.out.println("Enter the marks");
		
		for(int i=0;i<n;i++)
		{
			int mark=s.nextInt();
			obj.add(mark);
		}
		System.out.println(obj);
		ArrayList<Integer> obj1 =(ArrayList<Integer>)obj.clone();
		Collections.sort(obj1);
		System.out.print(obj1);
		s.close();
	}

}
