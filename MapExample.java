package map;
import java.util.*;
public class MapExample 
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1,"Amith");
		hashmap.put(2,"Jai");
		hashmap.put(3,"Rahul");
		hashmap.put(6,"Amith");
		hashmap.put(6,"Amith");
		for(Map.Entry m:hashmap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
