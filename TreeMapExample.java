package treemap1;
import java.io.*;
import java.util.*;
public class TreeMapExample 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			String value=br.readLine();
			int num=Integer.parseInt(br.readLine());
			map.put(value,num);
		}
		System.out.println(map);
		System.out.println("Enter the number of value to be removed");
		String s=br.readLine();
		map.remove(s);
		System.out.println("Enter the values to be add");
		String value1=br.readLine();
		int addkey=Integer.parseInt(br.readLine());
		map.put(value1,addkey);
		System.out.println(map);
		//
	}

}
